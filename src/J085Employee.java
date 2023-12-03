package src;
import java.util.*;

public class J085Employee  implements Comparable<J085Employee> {
    private String name;
    private String occupation;
    private int salary;

    public J085Employee(String firstname, String job, int value) {
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
        return "Name of employee is: " + name + " Occupation is: " + occupation + " Salary is: " + salary;
    }

    @Override
    public int compareTo(J085Employee comparemydata) {
        int compareValue = ((J085Employee)comparemydata).getSalary();

        return this.salary - compareValue;
    }

    public static void main(String args[]) {

        J085Employee employee1 = new J085Employee("Hello1","Programmer1",1000);
        J085Employee employee2 = new J085Employee("Hello2","Programmer2",7000);
        J085Employee employee3 = new J085Employee("Hello3","Programme3",6000);
        J085Employee employee4 = new J085Employee("Hello4","Programmer4",4000);
        J085Employee employee5 = new J085Employee("Hello5","Programmer5",8000);

        List<J085Employee> employee = new ArrayList();

         employee.add(employee1);
        employee.add(employee2);
        employee.add(employee3);
        employee.add(employee4);
        employee.add(employee5);

        System.out.println("Objects before sorting: ");
        for(J085Employee empl:employee) {
            System.out.println(empl);
        }

        System.out.println("\n");

        Collections.sort(employee);

        System.out.println("Objects after sorting: ");
        for(J085Employee empl:employee) {
            System.out.println(empl);
            }
        }

}
