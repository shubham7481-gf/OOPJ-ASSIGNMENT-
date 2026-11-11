import java.util.Scanner;

class Person {
    String fn;
    String ln;

    Person(String fn, String ln) {
        this.fn = fn;
        this.ln = ln;
    }

    String getFirstName() {
        return fn;
    }

    String getLastName() {
        return ln;
    }
}

class Employee extends Person {
    int id;
    String job;

    Employee(String fn, String ln, int id, String job) {
        super(fn, ln);
        this.id = id;
        this.job = job;
    }

    int getEmployeeId() {
        return id;
    }

    String getLastName() {
        return ln + " (" + job + ")";
    }
}

public class Ass9Q3 {
    public static void main(String[] SCP) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Person's first name: ");
        String pfn = sc.nextLine();
        System.out.print("Enter Person's last name: ");
        String pln = sc.nextLine();

        Person p1 = new Person(pfn, pln);
        System.out.println("Person: " + p1.getFirstName() + " " + p1.getLastName());

        System.out.print("Enter Employee's first name: ");
        String efn = sc.nextLine();
        System.out.print("Enter Employee's last name: ");
        String eln = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int eid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee's job title: ");
        String job = sc.nextLine();

        Employee e1 = new Employee(efn, eln, eid, job);
        System.out.println("Employee: " + e1.getFirstName() + " " + e1.getLastName());
        System.out.println("Employee ID: " + e1.getEmployeeId());

        sc.close();
    }
}