SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_account IN NUMBER,
    p_to_account   IN NUMBER,
    p_amount       IN NUMBER
) AS
    v_source_balance NUMBER;
BEGIN
    SELECT balance INTO v_source_balance
    FROM savings_accounts
    WHERE account_id = p_from_account;
    
    IF v_source_balance < p_amount THEN
        DBMS_OUTPUT.PUT_LINE('Transfer failed! Insufficient balance.');
        DBMS_OUTPUT.PUT_LINE('Available balance: $' || v_source_balance);
        DBMS_OUTPUT.PUT_LINE('Requested amount: $' || p_amount);
        RETURN;
    END IF;
    
    UPDATE savings_accounts
    SET balance = balance - p_amount
    WHERE account_id = p_from_account;
    
    UPDATE savings_accounts
    SET balance = balance + p_amount
    WHERE account_id = p_to_account;
    
    COMMIT;
    
    DBMS_OUTPUT.PUT_LINE('Transfer successful!');
    DBMS_OUTPUT.PUT_LINE('From Account: ' || p_from_account 
                          || ' | To Account: ' || p_to_account);
    DBMS_OUTPUT.PUT_LINE('Amount Transferred: $' || p_amount);
    DBMS_OUTPUT.PUT_LINE('Remaining Balance: $' || (v_source_balance - p_amount));
    
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Error: Account not found.');
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END TransferFunds;
/

BEGIN
    TransferFunds(1, 2, 1000);
END;
/