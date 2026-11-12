import java.util.Scanner;
import java.lang.*;

class Employee {
    String name;
    String job;
    double salary;

    Employee(String empName, String empJob, double empSalary) {
        name = empName;
        job = empJob;
        salary = empSalary;
    }

    double calculate(int workingDays) {
        return (salary / 22.0) * workingDays;
    }

    void update(int workingDays) {
        salary = calculate(workingDays);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Job: " + job);
        System.out.println("Salary: " + salary);
    }
}

class Ass7Q1 {
    public static void main(String SCP[]) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee("Alex", "Developer", 50000.0);

        System.out.println("Initial Employee Details");
        emp.display();

        System.out.print("\nEnter working days: ");
        int workingDays = sc.nextInt();

        double calcSalary = emp.calculate(workingDays);
        System.out.println("Calculated Salary for " + workingDays + " days: " + calcSalary);

        emp.update(workingDays);

        System.out.println("\nUpdated Employee Details");
        emp.display();

        sc.close();
    }
}