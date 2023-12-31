package src;
import java.util.*;
public class J086SortObjects  implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return (employee1.getSalary() - employee2.getSalary());
    }
    public static void main(String args[]) {
        Employee employee1 = new Employee("Hello1","Programmer1",1000);
        Employee employee2 = new Employee("Hello2","Programmer2",300);
        Employee employee3 = new Employee("Hello3","Programmer3",18000);
        Employee employee4 = new Employee("Hello4","Programmer4",900);
        Employee employee5 = new Employee("Hello5","Programmer5",8000);

        List<Employee> employeelist = new ArrayList();
        employeelist.add(employee1);
        employeelist.add(employee2);
        employeelist.add(employee3);
        employeelist.add(employee4);
        employeelist.add(employee5);

        System.out.println("Objects before sorting: ");
        for(Employee employee : employeelist) {
            System.out.println(employee);
        }

        System.out.println("\n");

        Collections.sort(employeelist, new J086SortObjects());

        System.out.println("Objects after sorting: ");
        for(Employee employee : employeelist) {
            System.out.println(employee);
        }

    }
}

    class Employee {
        private String name;
        private String occupation;
        private int salary;

        public Employee(String firstname, String job, int value) {
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
    }
