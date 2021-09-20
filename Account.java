package banking;

import java.util.ArrayList;

public class Account implements IAccount {

    protected int accountNumber;
    protected double balance;
    protected Client owner;
    protected static int counter = 0;
    protected ArrayList<Transaction> transactionList;

    public Account() {
        Account.incrementAccountCount();
        this.balance = 0d;
        this.owner = NULL;
        this.accountNumber = Account.counter;
        this.transactionList = new ArrayList<Transaction>();
    }

    public double deposit(double d) {
        Transaction depo = new Transaction();
        this.balance += d;
        depo.setType("Deposit");
        depo.setAmount(d);
        this.transactionList.add(depo);
        return balance;
    }

    public double withdrawal(double w) {
        Transaction with = new Transaction();
        this.balance -= w;
        with.setType("Withdrawal");
        with.setAmount(w);
        this.transactionList.add(with);
        return balance;
    }
    public ArrayList<Transaction> getTransactionList() {
		return this.transactionList;
	}
	
	public void displayAllTransactions() {
		System.out.println("List of Transactions:\n" + this.transactionList);
	}
	
	@Override
	public String toString() {
		// String output = "\nAccount Number: " + this.accountNumber +
		// 				"\nBalance: " + this.balance + 
		// 				"\nOwner: " + this.owner;
		// return output;
        return null;
	}

    public final void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public final void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }

    public final void setOwner(Client owner) {
        this.owner = owner;
    }
    public Client getOwner() {
        return this.owner;
    }

    public static void incrementAccountCount() {
        ++Account.counter;
    }
    public static int getAccountCount() {
        return counter;
    }

}