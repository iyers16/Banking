//done

import java.util.ArrayList;

public class Account implements IAccount {

    protected int accountNumber;
    protected double balance;
    protected Client owner;
    protected static int counter = 0;
    protected ArrayList<Transaction> transactionList = new ArrayList<>();
    protected final TypeOfAcc type;

    public enum TypeOfAcc {
        CHECKING, 
        SAVINGS
    }

    public Account(Client c, TypeOfAcc at) {
        ++Account.counter;
        this.accountNumber = Account.counter;
        this.owner = c;
        this.type = at;
        this.balance = 0;
    }

    public Account(TypeOfAcc at) {
        ++Account.counter;
        this.accountNumber = Account.counter;
        this.type = at;
        this.balance = 0;
    }

    public double deposit(double d) {
        this.balance += d;
        Transaction newDeposit = new Transaction(Transaction.TypeOfTransac.DEPOSIT, d);
        this.transactionList.add(newDeposit);
        return this.balance;
    }

    public double withdrawal(double w) {
        this.balance -= w;
        Transaction newWithdrawal = new Transaction(Transaction.TypeOfTransac.WITHDRAWAL, w);
        this.transactionList.add(newWithdrawal);
        return this.balance;
    }

    public void displayAllTransactions() {
        for (Transaction transaction : transactionList) {
            System.out.println(transaction);
        }
    }

    public Client getOwner() {return this.owner;}
    public void setOwner(Client source) {this.owner = source;}

    public int getAccountNumber() {return this.accountNumber;}
    public void setAccountNumber(int source) {this.accountNumber = source;}
    
    public double getBalance() {return this.balance;}
    public void setBalance(double source) {this.balance = source;}
    
    public ArrayList<Transaction> getTransactions() {return this.transactionList;}
    public void setTransactions(ArrayList<Transaction> source) {this.transactionList = source;}

    public int getAccountCount() {return Account.counter;}

    @Override
    public String toString() {
        return this.type + "(" + this.accountNumber + ") $" + this.balance;
    }
}
