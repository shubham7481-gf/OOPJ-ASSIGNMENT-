import java.util.Scanner;

class Employee {
    String name;
    double salary;
    int hiredate;
    
    Employee(String name, double salary, int hiredate) {
        this.name = name;
        this.salary = salary;
        this.hiredate = hiredate;
    }
    
    int calculateYearsAtService() {
        int currYear = 2026;
        return currYear - hiredate;
    }
}

public class Ass8Q3 {
    public static void main(String[] SCP) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        
        System.out.print("Enter hire date (year): ");
        int year = sc.nextInt();

        Employee emp = new Employee(name, salary, year);
                
        System.out.println("Employee name : " + emp.name);
        System.out.println("Employee Salary: Rs. " + emp.salary);
        System.out.println("Years at Service: " + emp.calculateYearsAtService());
    }
}