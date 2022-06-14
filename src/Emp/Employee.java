package Emp;

public class Employee {
    private String first;
    private String last;
    private String birth;

    public Employee (String first, String last, String birth){
        this.first = first;
        this.last = last;
        this.birth = birth;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    /* Assuming the Birthdate is of structure "mm/dd/yyyy" */
    public int getBirthMonth(){
        String date[] = this.birth.split("/");
        return Integer.parseInt(date[0]);
    }
}
