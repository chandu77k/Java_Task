package library;

public class Book {
    private int id;         // ID of the book
    private String title;   // Title of the book
    private String category; // Category of the book

    /**
     * Constructor to initialize a new Book object with the given ID, title, and category.
     *
     * @param id        The ID of the book.
     * @param title     The title of the book.
     * @param category  The category of the book.
     */
    public Book(int id, String title, String category) {
        this.id = id;           // Set the book ID
        this.title = title;     // Set the book title
        this.category = category; // Set the category of the book
    }

    /**
     * Getter method to retrieve the book ID.
     *
     * @return The ID of the book.
     */
    public int getId() {
        return id;  // Return the ID of the book
    }
    /**
     * Getter method to retrieve the book Title.
     *
     * @return The Title of the book.
     */
    public String getTitle() {
        return title;  // Return the Title of the book
    }

    /**
     * Getter method to retrieve the book category.
     *
     * @return The category of the book.
     */
    public String getCategory() {
        return category;  // Return the category of the book
    }

    /**
     * Override the toString() method to represent the book object as a string.
     *
     * @return A string representation of the book, including its ID, title, and category.
     */
    public String toString() {
        // Return a string that includes the book ID, title, and category in a readable format
        return "Book ID: " + id + ", Title: " + title + ", Category: " + category;
    }
}
