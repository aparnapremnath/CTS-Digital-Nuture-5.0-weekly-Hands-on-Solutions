SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
    v_interest_rate NUMBER := 0.01;
BEGIN
    UPDATE savings_accounts
    SET balance = balance + (balance * v_interest_rate)
    WHERE account_type = 'SAVINGS';
    
    DBMS_OUTPUT.PUT_LINE('Monthly interest applied to ' 
                          || SQL%ROWCOUNT || ' accounts.');
    DBMS_OUTPUT.PUT_LINE('Interest Rate: 1%');
    DBMS_OUTPUT.PUT_LINE('Process completed on: ' 
                          || TO_CHAR(SYSDATE, 'DD-MON-YYYY'));
    COMMIT;
    
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END ProcessMonthlyInterest;
/

BEGIN
    ProcessMonthlyInterest;
END;
/