package Emp;
import java.util.*;
import java.lang.*;

public class Employee {
    private String first;
    private String last;
    private String birth;

    public Employee (String first, String last, String birth) throws IllegalArgumentException{
        if(first.matches("[*/d*]")){
            throw new IllegalArgumentException("Invalid First Name");
        } else if(first.matches("[*/d*]")){
            throw new IllegalArgumentException("Invalid Last Name");
        }
        setFirst(first);
        setLast(last);
        setBirth(birth);
    }

    public String getLast() {
        return last;
    }

    private void setLast(String last) {
        this.last = last;
    }

    public String getBirth() {
        return birth;
    }

    private void setBirth(String birth) {
        this.birth = birth;
    }

    public String getFirst() {
        return first;
    }

    private void setFirst(String first) {
        this.first = first;
    }

    /* Assuming the Birthdate is of structure "mm/dd/yyyy" */
    public int getBirthMonth(){
        String date[] = this.birth.split("/");
        return Integer.parseInt(date[0]);
    }

    public String toString(){
        return this.first + " " + this.last + " " +  this.birth;
    }
}
