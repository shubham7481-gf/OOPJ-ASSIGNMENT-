import java.util.Scanner;

public class Ass11Q5 {
    public static void main(String[] SCP) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = sc.nextLine();

        int[] f = new int[65536];
        for (int i = 0; i < s.length(); i++) {
            f[s.charAt(i)]++;
        }

        int m1 = 0;
        for (int i = 0; i < f.length; i++) {
            if (f[i] > f[m1]) {
                m1 = i;
            }
        }

        int m2 = -1;
        for (int i = 0; i < f.length; i++) {
            if (i != m1 && f[i] > 0 && (m2 == -1 || f[i] > f[m2])) {
                m2 = i;
            }
        }

        if (m2 == -1) {
            System.out.println("No second most frequent character.");
        } else {
            System.out.println("Second most frequent character : '" + (char) m2 + "' (" + f[m2] + " times)");
        }

        sc.close();
    }
}