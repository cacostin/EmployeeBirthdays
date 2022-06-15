package Emp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeRunner {


    public static void main(String[] args) {

        String[] employees = {"Abe,Bee,10/29/1993", "Cee,Dee,2/10/1994", "Ee,Eff,1/17/1987"};
        Scanner s = new Scanner(System.in);
        System.out.println("");
        System.out.println("" +
                "What would you like to do?\n" +
                "Press 1 to display Birthdays this month \n" +
                "Press 2 to enter a specific Birth Month \n" +
                "Press 3 to Find out which month has the most Birthdays! \n" +
                "Press q to Quit");
        String cmd = s.next();
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

