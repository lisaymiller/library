package library;

public class Video extends LibraryItem implements Reserveable, Loanable {

    private double length;
    private String format;

    public Video(String title, String author, String publisher, int releaseYear, double length, String format) {
        super(title, author, publisher, releaseYear);
        this.length = length;
        this.format = format;
    }

    public double getLength() {
        return length;
    }

    public String getFormat() {
        return format;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setFormat(String format) {
        this.format = format;
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