import java.util.Scanner;

class Movie {
    String title;
    String director;
    String[] reviews;
    int count;
    
    Movie(String title, String director) {
        this.title = title;
        this.director = director;
        this.reviews = new String[10];
        this.count = 0;
    }
    
    void addReview(String review) {
        if (count < 10) {
            reviews[count] = review;
            count++;
        }
    }
    
    void displayReviews() {
            for (int i = 0; i < count; i++) {
                System.out.println("  " + (i+1) + ". " + reviews[i]);
            }
        }
    
}

public class Ass8Q4 {
    public static void main(String[] SCP) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        
        System.out.print("Enter director name: ");
        String director = sc.nextLine();
        
        Movie movie = new Movie(title, director);
        
        System.out.print("How many reviews do you want to add? ");
        int countt = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < countt; i++) {
            System.out.print("Enter review " + (i+1) + ": ");
            String review = sc.nextLine();
            movie.addReview(review);
        }
        

        System.out.println("Title: " + movie.title);
        System.out.println("Director: " + movie.director);
        System.out.println();
        
        movie.displayReviews();
    }
}