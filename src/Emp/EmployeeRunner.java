package Emp;

import java.util.*;
import java.time.*;

public class EmployeeRunner {


    public static void main(String[] args) {

        String[] employees = {"Abe,Bee,10/29/1993", "Cee,Dee,2/10/1994", "Ee,Eff,1/17/1987",
        "Gee,Eich,6/18/2002", "Aye,Jay,6/18/2002"};
        LocalDate date = LocalDate.now();
        EmployeeReader r = new EmployeeReader();
        ArrayList<Employee> e = r.readEmployees(employees);
        HashMap<Integer, ArrayList<Employee>> map = r.setEmployees(e);


        Scanner s = new Scanner(System.in);

        System.out.println("" +
                "What would you like to do?\n" +
                "Press 1 to display Birthdays this month \n" +
                "Press 2 to enter a specific Birth Month \n" +
                "Press 3 to Find out which month has the most Birthdays! \n" +
                "Press q to Quit");
        String cmd = s.next();

        while(!Objects.equals(cmd, "q")){
            switch(cmd){
                case "1":

                        int month = date.getMonthValue();
                        if(map.keySet().contains(month)){
                            for(int i = 0; i < map.get(month).size(); i++){
                                System.out.println(map.get(month).get(i).toString());
                            }
                            } else {
                            System.out.println("Month " + month + " has no Birthdays.");
                        }

                    break;
                case "2":
                    System.out.println("Which month would you like to see Birthdays for (enter month number 1-12)?");
                    int m = s.nextInt();


                    if(map.keySet().contains(m)){
                        for(int i = 0; i < map.get(m).size(); i++){
                            System.out.println(map.get(m).get(i).toString());
                        }
                    } else {
                        System.out.println("Month " + m + " has no Birthdays.");
                    }
                    break;
                case "3":

                    int max = 0;
                    int maxMonth = 0;
                    Iterator it = map.keySet().iterator();
                    while(it.hasNext()){
                        int key = (int) it.next();
                        if( max < map.get(key).size()){
                            max = map.get(key).size();
                            maxMonth = key;
                        }
                    }
                    System.out.println("Month " + maxMonth + " has the most birthdays with " + max + "!");
                    break;
            }
            System.out.print("\n");
            if(Objects.equals(cmd, "q")){
                break;
            }
            System.out.println("" +
                    "What would you like to do?\n" +
                    "Press 1 to display Birthdays this month \n" +
                    "Press 2 to enter a specific Birth Month \n" +
                    "Press 3 to Find out which month has the most Birthdays! \n" +
                    "Press q to Quit");

            cmd = s.next();
        }


    }
}

