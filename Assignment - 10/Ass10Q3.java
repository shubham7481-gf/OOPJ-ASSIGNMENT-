class Student {
    String n;
    int a;

    Student(String n, int a) {
        this.n = n;
        this.a = a;
    }

    Student() {
        this("Unknown", 0);
    }

    void disp() {
        this.shw();
    }

    void shw() {
        System.out.println("Name = " + n + ", Age = " + a);
    }

    Student self() {
        return this;
    }
}

public class Ass10Q3 {
    public static void main(String[] SCP) {
        Student s1 = new Student("Rajesh", 20);
        s1.disp();

        Student s2 = new Student();
        s2.disp();

        Student s3 = s1.self();
        System.out.println("s1 and self() are same object: " + (s1 == s3));
    }
}