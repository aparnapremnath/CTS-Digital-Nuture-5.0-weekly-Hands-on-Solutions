SET SERVEROUTPUT ON;

DECLARE
    v_age       NUMBER;
    
    CURSOR c_customers IS
        SELECT customer_id, date_of_birth
        FROM customers;
BEGIN
    FOR rec IN c_customers LOOP
        -- Calculate age
        v_age := TRUNC(MONTHS_BETWEEN(SYSDATE, rec.date_of_birth) / 12);
        
        IF v_age > 60 THEN
            UPDATE loans
            SET interest_rate = interest_rate - 1
            WHERE customer_id = rec.customer_id
              AND interest_rate > 1;
            
            DBMS_OUTPUT.PUT_LINE('Discount applied for Customer ID: ' 
                                  || rec.customer_id 
                                  || ' | Age: ' || v_age);
        END IF;
    END LOOP;
    
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Interest rate discount process completed.');
    
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/