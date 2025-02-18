package library;

public class LibraryManagement {

    public Book[] booksCatalog = new Book[50];  // Array to store books in the catalog
    public int bookCount = 0;  // Keeps track of the current number of books in the catalog

    /**
     * Adds some books to the library catalog for demonstration.
     * This method adds two books one from the Fiction category and one from the Science category.
     *
     * @return presentbooks This method does not return any value, it just adds books to the catalog.
     */
    public void presentbooks() {
        addBook(new Book(1, "Fiction book 1", Categories.fiction));
        addBook(new Book(2, "Science book 1", Categories.science));
    }

    /**
     * Adds a new book to the catalog.
     *
     * @param book The book object that needs to be added to the catalog.
     * @return addBook This method does not return any value, it simply adds the book to the catalog and prints a message.
     */
    public void addBook(Book book) {
        booksCatalog[bookCount++] = book;  // Adds the book to the catalog and increments the book count
        System.out.println("Book added to catalog: " + book);  // Prints confirmation message
    }

    /**
     * Updates the details of an existing book in the catalog.
     * @param bookId The unique ID of the book to be updated.
     * @param updatedBook The book object that contains the updated details.
     * @return updateBook This method does not return any value; it updates the book and prints a message.
     */
    public void updateBook(int bookId, Book updatedBook) {
        for (int i = 0; i < bookCount; i++) {
            if (booksCatalog[i].getId() == bookId) {  // Find the book by ID
                booksCatalog[i] = updatedBook;  // Update the book with new details
                System.out.println("Updated book: " + updatedBook);  // Prints the updated book
                break;
            }
        }
    }

    /**
     * Deletes a book from the catalog by its ID.
     * @param bookId The unique ID of the book to be deleted.
     * @return deleteBook This method does not return any value; it deletes the book and prints a message.
     */
    public void deleteBook(int bookId) {
        for (int i = 0; i < bookCount; i++) {
            if (booksCatalog[i].getId() == bookId) {  // Find the book by ID
                booksCatalog[i] = booksCatalog[bookCount - 1];  // Replace the book with the last book
                bookCount--;  // Decrease the book count
                System.out.println("Deleted book with ID: " + bookId);  // Prints confirmation message
                break;
            }
        }
    }

    /**
     * Displays the list of all books currently available in the library catalog.
     *
     * @return showCatalog This method does not return any value; it prints the catalog to the console.
     */
    public void showCatalog() {
        System.out.println("\nLibrary Catalog:");  // Prints the header for the catalog
        for (int i = 0; i < bookCount; i++) {
            System.out.println(booksCatalog[i]);  // Prints each book in the catalog
        }
    }
}
