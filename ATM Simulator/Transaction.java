public class Transaction {
    private String type;
    private double amount;
    private String date;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.date = java.time.LocalDate.now().toString();
    }

    @Override
    public String toString() {
        return date + " - " + type + ": $" + amount;
    }
}
