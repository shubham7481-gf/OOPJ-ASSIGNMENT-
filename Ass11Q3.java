import java.util.Scanner;

public class Ass11Q3 {
    public static void main(String[] SCP) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = sc.nextLine().toLowerCase();

        for (char c = 'a'; c <= 'z'; c++) {
            String idx = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    idx += i + " ";
                }
            }
            if (!idx.isEmpty()) {
                System.out.println(c + " : " + idx);
            }
        }

        sc.close();
    }
}