import java.util.Scanner;
import java.lang.*;

class Library {
    String b[] = new String[10];
    int n = 3;

    Library() {
        b[0] = "Java";
        b[1] = "Python";
        b[2] = "C++";
    }

    void addBook(String bk) {
        b[n] = bk;
        n++;
        System.out.println("Book added");
    }

    void removeBook(String bk) {
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (b[i].equalsIgnoreCase(bk)) {
                pos = i;
                break;
            }
        }
        if (pos != -1) {
            for (int i = pos; i < n - 1; i++) {
                b[i] = b[i + 1];
            }
            n--;
            System.out.println("Book removed");
        } else {
            System.out.println("Book not found");
        }
    }

    void display() {
        System.out.print("Books: ");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }
}

class Ass7Q5 {
    public static void main(String SCP[]) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        lib.display();

        System.out.print("Enter book to add: ");
        String addB = sc.nextLine();
        lib.addBook(addB);

        System.out.print("Enter book to remove: ");
        String remB = sc.nextLine();
        lib.removeBook(remB);

        lib.display();

        sc.close();
    }
}