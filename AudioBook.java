package library;

public class AudioBook extends LibraryItem {

    private String genre;
    private double length;

    public AudioBook(String title, String author, String publisher, int releaseYear, String genre, double length) {
        super(title, author, publisher, releaseYear);
        this.genre = genre;
        this.length = length;
    }

    // Getters
    public String getGenre() {
        return genre;
    }

    public double length() {
        return length;
    }

    // Setters
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setlength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "This " + this.genre + " audiobook is a " + this.length + " long listen.";
    }

}
