package library;

public class CardHolder<E> {
    private String name;
    private int libraryCard;
    private OverdueList<E> overdueBooks;

    public CardHolder(String name, int libraryCard, OverdueList<E> overdueBooks, Type overdueType) {
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

    public OverdueList<E> isOverdueBooks() {
        return overdueBooks;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLibraryCard(int card) {
        this.libraryCard = card;
    }

    public void setOverdueBooks(OverdueList<E> overdueBooks) {
        this.overdueBooks = overdueBooks;
    }

    public String toString() {
        if (overdueBooks != null) {
            return "Hello " + this.name + ". Please return " + this.overdueBooks + " or a late fee will apply.";
        } else {
            return "Hello " + this.name + "! Please come again.";
        }
    }
}