package banking;

public class Transaction {
    private String type;
    private double amount;

    public final void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return this.type;
    }

    public final void setAmount(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return this.amount;
    }
    
    String toString() {
        String output = "Transaction type: " + this.type + "\nTransaction amount: " + this.amount + "\n";
        return output;
    }
}
