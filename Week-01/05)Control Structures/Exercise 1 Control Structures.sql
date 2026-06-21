SET SERVEROUTPUT ON;

DECLARE
    CURSOR c_due_loans IS
        SELECT  l.loan_id,
                l.customer_id,
                c.name         AS customer_name,
                l.due_date,
                l.loan_amount,
                TRUNC(l.due_date - SYSDATE) AS days_remaining
        FROM    loans     l
        JOIN    customers c ON l.customer_id = c.customer_id
        WHERE   l.due_date BETWEEN SYSDATE AND SYSDATE + 30
        ORDER BY l.due_date ASC;
        
BEGIN
    DBMS_OUTPUT.PUT_LINE('===== Loan Due Date Reminders =====');
    DBMS_OUTPUT.PUT_LINE('Generated on: ' || TO_CHAR(SYSDATE, 'DD-MON-YYYY'));
    DBMS_OUTPUT.PUT_LINE('===================================');
    
    FOR rec IN c_due_loans LOOP
        DBMS_OUTPUT.PUT_LINE(
            'REMINDER >> '                                             ||
            'Customer: '  || rec.customer_name                        || ' | ' ||
            'Loan ID: '   || rec.loan_id                              || ' | ' ||
            'Amount: $'   || TO_CHAR(rec.loan_amount, '999,999.99')   || ' | ' ||
            'Due Date: '  || TO_CHAR(rec.due_date, 'DD-MON-YYYY')     || ' | ' ||
            'Days Left: ' || rec.days_remaining
        );
    END LOOP;
    
    DBMS_OUTPUT.PUT_LINE('===================================');
    DBMS_OUTPUT.PUT_LINE('Reminder process completed.');
    
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/