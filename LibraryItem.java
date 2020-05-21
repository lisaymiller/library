package library;

public class LibraryItem {
    private String title, author, publisher;
    private int releaseYear;

    public LibraryItem(String title, String author, String publisher, int releaseYear) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
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

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return this.title + " is written by " + this.author + " and published by " + this.publisher + ", circa "
                + this.releaseYear;
    }

}