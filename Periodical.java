package library;

public class Periodical extends LibraryItem implements Reserveable, Loanable {

    private String type;
    private boolean availableOnline;

    public Periodical(String title, Author author, PublishingCompany publisher, int releaseYear, String type,
            boolean availableOnline) {
        super(title, author, publisher, releaseYear);
        this.type = type;
        this.availableOnline = availableOnline;
    }

    // Getters
    public String getType() {
        return type;
    }

    public boolean getAvailableOnline() {
        return availableOnline;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }

    public void setAvailableOnline(boolean online) {
        this.availableOnline = online;
    }

    @Override
    public String toString() {
        return "This " + this.type + " is " + isAvailableOnline(availableOnline) + " available online.";
    }

    public String isAvailableOnline(boolean online) {
        if (online == true) {
            return "currently";
        } else {
            return "not currently";
        }
    }

    @Override
    public boolean isLoanable() {
        return false;
    }

    @Override
    public int maxTimeAllowedDays() {
        return 0;
    }

    @Override
    public boolean isReserveable() {
        return true;
    }

    @Override
    public int maxTimeAllowedHours() {
        return 4;
    }
}