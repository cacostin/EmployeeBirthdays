/* This class is used to read in all the employees from an array of employees */
package Emp;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class EmployeeReader {

    public EmployeeReader() {
    }

    /* This function assumes each entry in the array is of format
     * ["First,Last,Birthdate"]
     */
    public ArrayList<Employee> readEmployees(String[] empArr) {

        /* Initialize employee list */
        ArrayList<Employee> empList = new ArrayList<>();

        for (String s : empArr) {
            String[] emp = s.split(",");
            String first = emp[0];
            String last = emp[1];
            String birth = emp[2];

            Employee e = new Employee(first, last, birth);
            empList.add(e);
        }

        return empList;
    }

    /* This program creates list of employees based on birth month and adds them to a map
     * using birth month as a key.
     */
    public HashMap<Integer, ArrayList<Employee>> setEmployees(ArrayList<Employee> empList) {

        HashMap<Integer, ArrayList<Employee>> empMap = new HashMap<>();

        for (Employee temp : empList) {
            ArrayList<Employee> list = empMap.computeIfAbsent(temp.getBirthMonth(), k -> new ArrayList<>());
            list.add(temp);

        }
        return empMap;
    }

    public ArrayList<Employee> fileReader(String filename) throws FileNotFoundException {

        ArrayList<Employee> list = new ArrayList<>();
        try {
            Scanner fr = new Scanner(new File(filename));
            Employee temp;
            while (fr.hasNext() ) {
                String[] split = fr.nextLine().split(",");
                temp = new Employee(split[0], split[1], split[2]);
                list.add(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Invalid File name");
        }
        return list;
    }
}
