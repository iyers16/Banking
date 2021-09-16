package banking;

import java.util.ArrayList;

public class Account implements IAccount {

    protected int accountNumber;
    protected double balance;
    protected Client owner;
    private static int counter = 0;

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
        ++this.counter;
    }
    public static int getAccountCount() {
        return this.counter;
    }

}
