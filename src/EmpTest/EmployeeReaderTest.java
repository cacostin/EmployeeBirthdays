package EmpTest;

import Emp.*;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeReaderTest {
    String[] employees = {"Abe,Bee,10/29/1993", "Cee,Dee,2/10/1994", "Ee,Eff,1/17/1987"};
    EmployeeReader r = new EmployeeReader();
    ArrayList<Employee> e = r.readEmployees(employees);
    @org.junit.jupiter.api.Test
    void readEmployees() {

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

        @Test
        void fileReader() {
            String filename = "Files/Employees.txt";
            EmployeeReader r = new EmployeeReader();
            try{
            r.fileReader(filename);
        } catch (FileNotFoundException e){

            }
    }
}
