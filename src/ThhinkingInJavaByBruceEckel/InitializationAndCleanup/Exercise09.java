package ThhinkingInJavaByBruceEckel.InitializationAndCleanup;

/**
 * Created by ibakhtin on 04.03.17.
 */

// Exrcise 9

class Book {
    int pages = 0;
    String coverType = "soft cover";

    Book(int pages) {
        this.pages = pages;
    }
    Book(int pages, String coverType) {
        this(pages);
        this.coverType = coverType;
    }
}

public class Exercise09 {
    public static void main(String[] args) {
        Book bookA = new Book(100);
        Book bookB = new Book(200, "hard cover");
        System.out.println("The book A has "
                + bookA.pages + " pages, and a " + bookA.coverType + ".");
        System.out.println("The book B has "
                + bookB.pages + " pages, and a " + bookB.coverType + ".");
    }
}
