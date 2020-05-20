package library;

public class Periodical extends LibraryItem {
    public Periodical(String author, String title, String publisher, String type, String format, int releaseYear) {
        super(title, author, publisher, type, format, releaseYear);
    }
}