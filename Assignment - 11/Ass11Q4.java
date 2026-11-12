import java.util.Scanner;

public class Ass11Q4 {
    public static void main(String[] SCP) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = sc.nextLine().toLowerCase();

        boolean p = true;
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                p = false;
                break;
            }
        }

        if (p) {
            System.out.println("\"" + s + "\" is a palindrome.");
        } else {
            System.out.println("\"" + s + "\" is not a palindrome.");
        }

        sc.close();
    }
}