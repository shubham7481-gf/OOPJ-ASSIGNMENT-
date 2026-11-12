class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Ass8Q1 {
    public static void main(String[] SCP) {
        Person p1 = new Person("Rajesh", 20);
        Person p2 = new Person("Sambit", 19);
        
        System.out.println("Person 1: Name = " + p1.name + ", Age = " + p1.age);
        System.out.println("Person 2: Name = " + p2.name + ", Age = " + p2.age);
    }
}