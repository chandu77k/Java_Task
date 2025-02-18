package library;

public class Member implements LibraryInterface {

    /**
     * Allows the member to search for books in a given category.
     *
     * @param category The category of books to search for (e.g., "Fiction", "Science").
     * @return booksearch This method does not return any value, it just prints a search message.
     */
    public void booksearch(String category) {
        System.out.println("Member is searching books in category: " + category+"\n");
    }

    /**
     * Allows the member to borrow a book from the library.
     *
     * @param bookId The ID of the book to be borrowed.
     * @param memberId The ID of the member borrowing the book.
     * @return borrowbook This method does not return any value, it just prints a borrow message.
     */
    public void borrowbook(int bookId, int memberId) {
        System.out.println("Member " + memberId + " borrowed book with ID: " + bookId+"\n");
    }

    /**
     * Allows the member to return a borrowed book to the library.
     *
     * @param bookId The ID of the book being returned.
     * @param memberId The ID of the member returning the book.
     * @return returnbook This method does not return any value, it just prints a return message.
     */
    public void returnbook(int bookId, int memberId) {
        System.out.println("Member " + memberId + " returned book with ID: " + bookId+"\n");
    }

    /**
     * This method is not accessible for members. Members cannot add books to the catalog.
     *
     * @param book The book object that is supposed to be added.
     * @return addbook This method does not return any value, it simply prints an error message.
     */
    public void addbook(Book book) {
        System.out.println("Members cannot add books to the catalog."+"\n");
    }

    /**
     * This method is not accessible for members. Members cannot update books in the catalog.
     *
     * @param bookId The ID of the book to be updated.
     * @param updatedBook The updated book object with new details.
     * @return updateBook This method does not return any value, it simply prints an error message.
     */
    public void updateBook(int bookId, Book updatedBook) {
        System.out.println("Members cannot update books in the catalog."+"\n");
    }

    /**
     * This method is not accessible for members. Members cannot delete books from the catalog.
     *
     * @param bookId The ID of the book to be deleted.
     * @return deleteBook This method does not return any value, it simply prints an error message.
     */
    public void deleteBook(int bookId) {
        System.out.println("Members cannot delete books from the catalog."+"\n");
    }
}
