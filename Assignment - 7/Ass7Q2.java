import java.util.Scanner;
import java.lang.*;

class Student {
    String n;
    int r;
    String c;

    Student(String sName, int sRoll) {
        n = sName;
        r = sRoll;
        c = "None";
    }

    void selectCourse(int ch) {
        switch (ch) {
            case 1:
                c = "Computer Science";
                break;
            case 2:
                c = "Information Technology";
                break;
            case 3:
                c = "Electronics Engineering";
                break;
            case 4:
                c = "Mechanical Engineering";
                break;
            default:
                c = "Invalid Option";
                break;
        }
    }

    void display() {
        System.out.println("Name: " + n);
        System.out.println("Roll No: " + r);
        System.out.println("Course: " + c);
    }
}

class Ass7Q2 {
    public static void main(String SCP[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String n = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int r = sc.nextInt();

        Student st = new Student(n, r);

        System.out.println("\n1. Computer Science\n2. Information Technology\n3. Electronics Engineering\n4. Mechanical Engineering");
        System.out.print("Select Option (1-4): ");
        int ch = sc.nextInt();

        st.selectCourse(ch);

        System.out.println("\n--- Details ---");
        st.display();

        sc.close();
    }
}