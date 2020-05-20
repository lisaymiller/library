package library;

public class LibraryItem {
    private String title, author, publisher, type, format;
    private int releaseYear;

    public LibraryItem(String title, String author, String publisher, String type, String format, int releaseYear) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.type = type;
        this.format = format;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getType() {
        return type;
    }

    public String getFormat() {
        return format;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return this.title + " is written by " + this.author + " and published by " + this.publisher + ", circa "
                + this.releaseYear + ". This " + this.type + " is available in " + this.format + ".";
    }

}