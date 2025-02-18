package library;

public class Librarian implements LibraryInterface {

    /**
     * Allows the librarian to search for books in a category.
     *
     * @param category The category of books to search for.
     * @return booksearch This method doesn't return any value; it simply prints a search message.
     */
    public void booksearch(String category) {
        System.out.println("Librarian is searching books in category: " + category+"\n");
    }

    /**
     * Allows a member to borrow a book from the library.
     *
     * @param bookId The unique ID of the book being borrowed.
     * @param memberId The unique ID of the member borrowing the book.
     * @return borrowbook This method doesn't return any value; it simply prints a borrow message.
     */
    public void borrowbook(int bookId, int memberId) {
        System.out.println("Librarian allows Member " + memberId + " to borrow book with ID: " + bookId+"\n");
    }

    /**
     * Allows a member to return a borrowed book.
     *
     * @param bookId The unique ID of the book being returned.
     * @param memberId The unique ID of the member returning the book.
     * @return returnbook This method doesn't return any value; it simply prints a return message.
     */
    public void returnbook(int bookId, int memberId) {
        System.out.println("Librarian allows Member " + memberId + " to return book with ID: " + bookId+"\n");
    }

    /**
     * Allows the librarian to add a new book to the library's collection.
     *
     * @param book The book object to be added to the library.
     * @return addbook This method doesn't return any value; it simply prints an add book message.
     */
    public void addbook(Book book) {
        System.out.println("Librarian is adding new book: " + book+"\n");
    }

    /**
     * Allows the librarian to update the details of an existing book.
     *
     * @param bookId The ID of the book to be updated.
     * @param updatedBook The updated book object containing the new details.
     * @return updateBook This method doesn't return any value; it simply prints an update message.
     */
    public void updateBook(int bookId, Book updatedBook) {
        System.out.println("Librarian is updating book ID " + bookId + " with details: " + updatedBook+"\n");
    }

    /**
     * Allows the librarian to delete a book from the library's collection.
     *
     * @param bookId The ID of the book to be deleted.
     * @return deleteBook This method doesn't return any value; it simply prints a delete message.
     */
    public void deleteBook(int bookId) {
        System.out.println("Librarian is deleting book with ID: " + bookId+"\n");
    }
}
