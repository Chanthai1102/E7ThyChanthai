package src;
import java.util.ArrayList;
import java.util.List;
public class J084Employee {
    private String name;
    private String occupation;
    private int salary;

    public J084Employee(String firstname, String job, int value) {
        super();
        this.name = firstname;
        this.occupation = job;
        this.salary = value;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + ", Occupation: " + occupation + ", Salary: $" + salary;
    }
    public static void main(String args[]) {
        J084Employee employee1 = new J084Employee("Hello","Programmer",1000);
        J084Employee employee2 = new J084Employee("Jude","Doctor",4000);
        J084Employee employee3 = new J084Employee("Joseph","Lawyer",500);
        J084Employee employee4 = new J084Employee("Vivian","Nurse",700);
        J084Employee employee5 = new J084Employee("Juliet","Chef",10000);
        J084Employee employee6 = new J084Employee("Mark","Gradener",70000);

        List<J084Employee> employeelist = new ArrayList<>();

        employeelist.add(employee1);
        employeelist.add(employee2);
        employeelist.add(employee3);
        employeelist.add(employee4);
        employeelist.add(employee5);
        employeelist.add(employee6);

        System.out.println("The Employee data is below \n");
        for(J084Employee employee:employeelist) {
            System.out.println(employee);
        }
    }
}
