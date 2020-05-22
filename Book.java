package library;

public class Book extends LibraryItem implements Loanable, Reserveable {

    private String genre, format;

    public Book(String title, Author author, PublishingCompany publisher, int releaseYear, String genre,
            String format) {
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

    @Override
    public boolean isReserveable() {
        return false;
    }

    @Override
    public int maxTimeAllowedHours() {
        return 0;
    }

    @Override
    public boolean isLoanable() {
        return true;
    }

    @Override
    public int maxTimeAllowedDays() {
        return 10;
    }

    // @Override
    // public double lateFee() {
    // if (lateFee!= null) {
    // return 5.00;
    // } else {
    // return 0.0;
    // }
    // }

}