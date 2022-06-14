package Emp;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeRunner {


    public static void main(String[] args) {
        String[] employees = {"Abe,Bee,10/29/1993", "Cee,Dee,2/10/1994", "Ee,Eff,1/17/1987"};
        EmployeeReader r = new EmployeeReader();
        ArrayList<Employee> e = r.readEmployees(employees);
        for (int i = 0; i < e.size(); i++) {
            System.out.println(e.get(i).getFirst());
        }
        HashMap<Integer, ArrayList<Employee>> map = r.setEmployees(e);

        for( int key : map.keySet()){
            for(int i = 0; i < map.get(key).size(); i++){
                System.out.println("Month:" + key + " " + map.get(key).get(0).getBirth());
            }
        }
    }
}

