/* This class is used to read in all the employees from an array of employees */
package Emp;
import java.util.*;

public class EmployeeReader {

    public EmployeeReader(){
    }
    /* This function assumes each entry in the array is of format
     * ["First,Last,Birthdate"]
     */
    public ArrayList<Employee> readEmployees(String[] empArr){

        /* Initialize employee list */
        ArrayList<Employee> empList = new ArrayList<>();

        for(int i = 0; i < empArr.length; i++){
            String[] emp = empArr[i].split(",");
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
    public HashMap<Integer, ArrayList<Employee>> setEmployees(ArrayList<Employee> empList){

        HashMap<Integer, ArrayList<Employee>> empMap = new HashMap<>();

        System.out.println(empList.size());

        for (Employee temp : empList) {
            ArrayList<Employee> list = empMap.computeIfAbsent(temp.getBirthMonth(), k -> new ArrayList<>());
            list.add(temp);

        }
        return empMap;
    }

    public HashMap<Integer, ArrayList<Employee>> initMap (){
        HashMap<Integer, ArrayList<Employee>> temp = new HashMap<>();
        for (int i = 0; i < 12; i++){
            temp.put(i, new ArrayList<>());
        }
        return temp;
    }
}
