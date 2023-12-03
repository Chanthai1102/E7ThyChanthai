package src;
class students {
    String firstname;
    String lastname;

    students(String fname, String lname) {
        firstname = fname;
        lastname = lname;
    }
}

class schools extends students {
    int grade;
    String subject;

    schools(String fname, String lname, int score, String sub) {
        super(fname, lname); // Call to superclass constructor (student)
        grade = score;
        subject = sub;
    }
}

public class J106SuperInheritance {
    public static void main(String args[]) {
        schools sch = new schools("David", "Jacob", 98, "Java");

        System.out.println("Student's firstname is: " + sch.firstname);
        System.out.println("Student's lastname is: " + sch.lastname);
        System.out.println("Student's grade is: " + sch.grade);
        System.out.println("Student's subject is: " + sch.subject);
    }
}
