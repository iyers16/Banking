//done

import java.util.Scanner;

public class UserInputManager implements IUserInputManager {
    public UserInputManager() {}

    public int retrieveAccountNumber() {
        Scanner sc = new Scanner(System.in);

        int accountNum = -1;
        System.out.println("\nAccount number: ");

        accountNum = sc.nextInt();
         

        return accountNum;
    }

    public Account retrieveAccountType() {
        Scanner sc = new Scanner(System.in);

        int type = -1;

        System.out.println("""
                            Account type:

                            1. Checking;
                            2. Savings;
                            \n""");

        type = sc.nextInt();
        Account acc = null;

        if (type == 1) {
            acc = new CheckingAccount();
        } else if (type == 2) {
            acc = new SavingsAccount();
        }

         
        return acc;
    }

    public int retrieveClientId() {
        Scanner sc = new Scanner(System.in);

        int cid = -1;

        System.out.println("\nEnter the client ID: ");
        cid = sc.nextInt();

         

        return cid;
    }

    public Client retrieveClientInfo() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nClient first name: ");
        String fname = sc.nextLine();

        if (fname.isBlank()) {
             
            return null;
        }

        System.out.println("\nClient last name: ");

        String lname = sc.nextLine();

        if (lname.isBlank()) {
             
            return null;
        }

         
        return new Client(fname, lname);
    }

    public double retrieveTransactionAmount() {

        Scanner sc = new Scanner(System.in);

        double tamount = 0;

        System.out.println("\nTransaction amount: ");
        tamount = sc.nextDouble();

         

        return tamount;
    }

    public int retrieveUserOption() {

        Scanner sc = new Scanner(System.in);

        int option = -1;
        System.out.println("""  
                            Select an option:\n
                            1. Add a new client;
                            2. Create a new account;
                            3. Make a deposit;
                            4. Make a withdrawal;
                            5. List account transactions;
                            6. List clients;
                            7. List client accounts;
                            8. Exit;
                            \nSelection: """);
        option = sc.nextInt();
         

        return option;
    }
}
