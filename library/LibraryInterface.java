package library;

interface LibraryInterface {
    
    /**
     * Searches for books in the given category.
     *
     * @param category The category of books to search for (e.g., "Fiction", "Science").
     * @return booksearch This method does not return any value; it defines the contract for searching books.
     */
    void booksearch(String category);
    
    /**
     * Allows a member to borrow a book.
     *
     * @param bookId The unique ID of the book to be borrowed.
     * @param memberId The unique ID of the member borrowing the book.
     * @return borrowbook This method does not return any value; it defines the contract for borrowing a book.
     */
    void borrowbook(int bookId, int memberId);
    
    /**
     * Allows a member to return a borrowed book.
     *
     * @param bookId The unique ID of the book being returned.
     * @param memberId The unique ID of the member returning the book.
     * @return returnbook This method does not return any value; it defines the contract for returning a book.
     */
    void returnbook(int bookId, int memberId);
    
    /**
     * Allows the librarian to add a new book to the library's collection.
     *
     * @param book The book object that contains details of the new book to be added.
     * @return addbook This method does not return any value; it defines the contract for adding a book to the library.
     */
    void addbook(Book book);
    
    /**
     * Allows the librarian to update the details of an existing book.
     *
     * @param bookId The ID of the book to be updated.
     * @param updatedBook The updated book object containing the new details for the book.
     * @return updateBook This method does not return any value; it defines the contract for updating a book.
     */
    void updateBook(int bookId, Book updatedBook);
    
    /**
     * Allows the librarian to delete a book from the library's collection.
     *
     * @param bookId The ID of the book to be deleted.
     * @return deleteBook This method does not return any value; it defines the contract for deleting a book.
     */
    void deleteBook(int bookId);
}
