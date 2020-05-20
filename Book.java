package library;

public class Book extends LibraryItem {
    public Book(String author, String title, String publisher, String type, String format, int releaseYear) {
        super(title, author, publisher, type, format, releaseYear);
    }
}