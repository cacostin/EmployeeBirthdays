package EmpTest;

import Emp.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeReaderTest {

    @org.junit.jupiter.api.Test
    void readEmployees() {
        String employees[] = {"Abe,Bee,10/29/1993", "Cee,Dee,2/10/1994", "Ee,Eff,1/17/1987"};
        EmployeeReader r = new EmployeeReader();

        ArrayList<Employee> e = r.readEmployees(employees);
        assertTrue(!e.isEmpty());
        assertEquals(3,e.size());
        assertEquals("Abe", e.get(0).getFirst());
        assertEquals("Bee", e.get(0).getLast());
        assertEquals("10/29/1993", e.get(0).getBirth());
        assertEquals(10, e.get(0).getBirthMonth());







    }

    @org.junit.jupiter.api.Test
    void setEmployees() {
    }
}