package banking;

import java.util.ArrayList;

public class Account implements IAccount {

    protected int accountNumber;
    protected double balance;
    protected Client owner;
    private static int counter = 0;

}
