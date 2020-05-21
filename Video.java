package library;

public class Video extends LibraryItem {

    private double length;

    public Video(String title, String author, String publisher, int releaseYear, double length) {
        super(title, author, publisher, releaseYear);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}