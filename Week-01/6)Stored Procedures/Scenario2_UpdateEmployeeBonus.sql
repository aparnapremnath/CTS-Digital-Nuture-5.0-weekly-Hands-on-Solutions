SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department_id IN NUMBER,
    p_bonus_percent IN NUMBER
) AS
BEGIN
    UPDATE employees
    SET salary = salary + (salary * p_bonus_percent / 100),
        bonus  = salary * p_bonus_percent / 100
    WHERE department_id = p_department_id;
    
    IF SQL%ROWCOUNT = 0 THEN
        DBMS_OUTPUT.PUT_LINE('No employees found in Department ID: ' 
                              || p_department_id);
    ELSE
        DBMS_OUTPUT.PUT_LINE('Bonus of ' || p_bonus_percent 
                              || '% applied to ' || SQL%ROWCOUNT 
                              || ' employees in Department ID: ' 
                              || p_department_id);
    END IF;
    
    COMMIT;
    
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END UpdateEmployeeBonus;
/

BEGIN
    UpdateEmployeeBonus(10, 10);
END;
/