SET SERVEROUTPUT ON;

DECLARE
    CURSOR c_customers IS
        SELECT customer_id, name, balance
        FROM customers;
BEGIN
    FOR rec IN c_customers LOOP
        IF rec.balance > 10000 THEN
            UPDATE customers
            SET is_vip = 'TRUE'
            WHERE customer_id = rec.customer_id;
            
            DBMS_OUTPUT.PUT_LINE('Customer ' || rec.name 
                                  || ' (ID: ' || rec.customer_id || ')'
                                  || ' promoted to VIP. Balance: $' 
                                  || rec.balance);
        ELSE
            UPDATE customers
            SET is_vip = 'FALSE'
            WHERE customer_id = rec.customer_id;
            
            DBMS_OUTPUT.PUT_LINE('Customer ' || rec.name 
                                  || ' (ID: ' || rec.customer_id || ')'
                                  || ' does not qualify for VIP. Balance: $' 
                                  || rec.balance);
        END IF;
    END LOOP;
    
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('VIP status update process completed.');
    
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/