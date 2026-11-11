import java.util.Scanner;

public class Ass11Q2 {
    public static void main(String[] SCP) {
        Scanner sc = new Scanner(System.in);

        System.out.print("String 1 : ");
        String s1 = sc.nextLine();
        System.out.print("String 2 : ");
        String s2 = sc.nextLine();

        boolean same = s1.length() == s2.length();

        for (int i = 0; same && i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                same = false;
            }
        }

        if (same) {
            System.out.println("Both strings contain the same data.");
        } else {
            System.out.println("Strings contain different data.");
        }

        sc.close();
    }
}