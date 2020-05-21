package library;

public class AudioBook extends LibraryItem implements Reserveable, Loanable {

    private String genre;
    private double length;
    private String format;

    public AudioBook(String title, String author, String publisher, int releaseYear, String genre, double length,
            String format) {
        super(title, author, publisher, releaseYear);
        this.genre = genre;
        this.length = length;
        this.format = format;
    }

    // Getters
    public String getGenre() {
        return genre;
    }

    public double getLength() {
        return length;
    }

    public String getFormat() {
        return format;
    }

    // Setters
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setlength(double length) {
        this.length = length;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "This " + this.genre + " audiobook is a " + this.length + " long listen.";
    }

    @Override
    public boolean isLoanable() {
        if (getFormat().equals("physical")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int maxTimeAllowedDays() {
        return 5;
    }

    @Override
    public boolean isReserveable() {
        if (getFormat().equals("digital")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int maxTimeAllowedHours() {
        return 4;
    }

}
