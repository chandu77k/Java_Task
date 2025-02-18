package library;
import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for login type
        System.out.println("Login Type : ");
        String type = scanner.next();

        // Create a LibraryManagement object and present initial books
        LibraryManagement librarymanagement = new LibraryManagement();
        librarymanagement.presentbooks();
        librarymanagement.addBook(new Book(3, "History Book 1", Categories.history));

        // Execute logic based on the login type
        if (type.contentEquals("member")) {
            // Member functionality
            Member member = new Member();
            member.borrowbook(1, 101); // Member borrows a book
        } else if (type.contentEquals("librarian")) {
            // Librarian functionality
            Librarian librarian = new Librarian();
            librarian.booksearch(Categories.fiction);  // Librarian searches for books in fiction category
            librarian.updateBook(2, new Book(2, "Book-2", Categories.nonfiction));  // Librarian updates a book
            librarian.deleteBook(2);  // Librarian deletes a book
        }

        // Track borrowed books by member
        TrackingSystem trackingSystem = new TrackingSystem();
        trackingSystem.trackBorrowedBooks(1, 101);  // Tracks borrowed book by member

        // Process late fee payment
        LateFee latefee = new LateFee();
        latefee.makePayment(1, 101, 3);  // Member makes a payment for a late return

        // Show library catalog
        librarymanagement.showCatalog();

        // Close scanner object
        scanner.close();
    }
}
