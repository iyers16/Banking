//done

public class Transaction implements ITransaction {
    private TypeOfTransac type;
    private double amount;

    public enum TypeOfTransac {
        WITHDRAWAL, 
        DEPOSIT
    }

    public Transaction(TypeOfTransac type, double amount) {
        this.type = type;
        this.amount = amount;
    }
    
    public TypeOfTransac getType() {return this.type;}
    
    public void setType(TypeOfTransac source) {this.type = source;}
    
    public double getAmount() {return this.amount;}
    
    public void setAmount(double source) {this.amount = source;}


    @Override
    public String toString() {
        return this.type + " of $ " + this.amount;
    }
}
