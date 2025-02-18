package library;
import java.util.*;

public class TrackingSystem {

    /**
     * Tracks the borrowed books by the member, book ID, member ID, and the date of borrowing.
     *
     * @param bookId The ID of the borrowed book.
     * @param memberId The ID of the member who borrowed the book.
     * @return trackBorrowedBooks This method does not return any value, it simply prints tracking information.
     */
    public void trackBorrowedBooks(int bookId, int memberId) {
        System.out.println("Tracking borrowed book. Book ID: " + bookId + ", Member ID: " + memberId + ", Borrowed on: " + new Date());
    }
}
