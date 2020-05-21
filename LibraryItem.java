package library;

public class LibraryItem {
    private String title;
    private Author author;
    private PublishingCompany publisher;
    private int releaseYear;

    public LibraryItem(String title, Author author, PublishingCompany publisher, int releaseYear) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public PublishingCompany getPublisher() {
        return publisher;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String toString() {
        return this.title + " is written by " + this.author + " and published by " + this.publisher + ", circa "
                + this.releaseYear;
    }

}