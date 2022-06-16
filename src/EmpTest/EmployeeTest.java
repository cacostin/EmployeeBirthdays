package EmpTest;

import Emp.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee one;
    Employee two = new Employee("Tim", "Smith", "10/7/1992");

    @Test
    void getLast() {

        try{
            one = new Employee("Tim", "Sm3th", "10/7/1992");
        } catch (IllegalArgumentException e){
            assertEquals("Invalid Last Name", e.getMessage());
        }

        assertEquals("Smith", two.getLast());
    }


    @Test
    void getBirth() {
        assertEquals("10/7/1992",two.getBirth());
    }

    @Test
    void getFirst() {
        try{
            one = new Employee("T1m", "Smith", "10/7/1992");
        } catch (IllegalArgumentException e){
            assertEquals("Invalid First Name", e.getMessage());
        }
    }

    @Test
    void getBirthMonth() {
        assertEquals(10,two.getBirthMonth());
    }
}