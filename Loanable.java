package library;

interface Loanable {

    boolean isLoanable();

    int maxTimeAllowedDays();

    int lateFee();

}