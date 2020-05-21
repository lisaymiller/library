package library;

public class CardHolder {
    private String name;
    private int libraryCard;
    private boolean overdueBooks;

    public CardHolder(String name, int libraryCard, boolean overdueBooks) {
        this.name = name;
        this.libraryCard = libraryCard;
        this.overdueBooks = overdueBooks;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getLibraryCard() {
        return libraryCard;
    }

    public boolean isOverdueBooks() {
        return overdueBooks;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLibraryCard(int card) {
        this.libraryCard = card;
    }

    public void setOverdueBooks(boolean overdueBooks) {
        this.overdueBooks = overdueBooks;
    }
}