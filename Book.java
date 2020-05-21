package library;

public class Book extends LibraryItem {

    private String genre, format;

    public Book(String title, String author, String publisher, int releaseYear, String genre, String format) {
        super(title, author, publisher, releaseYear);
        this.genre = genre;
        this.format = format;
    }

    // Getters
    public String getGenre() {
        return genre;
    }

    public String format() {
        return format;
    }

    // Setters
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "This " + this.genre + " literature comes in " + this.format;
    }

}