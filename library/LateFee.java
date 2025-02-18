package library;

public class LateFee {

    /**
     * Processes the payment for the late return of a book by a member.
     * This method calculates and records the late fee payment based on the book ID, member ID, and the number of days the book is late.
     * 
     * @param bookId   The unique identifier of the book that was returned late.
     * @param memberId The unique identifier of the member who returned the book late.
     * @param daysLate The number of days the book was returned after the due date.
     * @return makePayment   This method does not return any value, it simply prints the payment details to the console.
     */
    public void makePayment(int bookId, int memberId, int daysLate) {
        // Prints a message about the payment made for the late return of a book
        System.out.println("\nMember " + memberId + " paid for late return of book with ID: " + bookId + ". Days late: " + daysLate);
    }
}
