import java.util.Scanner;

public class Ass11Q1 {
    public static void main(String[] SCP) {
        Scanner sc = new Scanner(System.in);

        System.out.print("String 1 : ");
        String s1 = sc.nextLine();
        System.out.print("String 2 : ");
        String s2 = sc.nextLine();

        int r = s1.compareTo(s2);

        if (r < 0) {
            System.out.println("\"" + s1 + "\" is less than \"" + s2 + "\"");
        } else if (r > 0) {
            System.out.println("\"" + s1 + "\" is greater than \"" + s2 + "\"");
        } else {
            System.out.println("\"" + s1 + "\" is equal to \"" + s2 + "\"");
        }

        sc.close();
    }
}