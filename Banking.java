//done

public class Banking {
    public static void main(String[] args) {

        Bank b = new Bank("123", "123 rue ABC");

        System.out.println("\nBank " + b.getBankNumber() + ", Open for business!");

        indexPage(b);
    }

    private static void indexPage(Bank b) {

        UserInputManager userInpMan = new UserInputManager();

        switch (userInpMan.retrieveUserOption()) {
            case 1 :
                createClient(b, userInpMan);
                break;
            case 2 :
                createAccount(b, userInpMan);
                break;
            case 3 :
                createTransaction(b, userInpMan, Transaction.TypeOfTransac.DEPOSIT);
                break;
            case 4 :
                createTransaction(b, userInpMan, Transaction.TypeOfTransac.WITHDRAWAL);
                break;
            case 5 :
                listTransactions(b, userInpMan);
                break;
            case 6 :
                listClients(b);
                break;
            case 7 :
                listAccounts(b, userInpMan);
                break;
            case 8 :
                System.out.println("\n- " + b.getBankNumber()+" - Bank is closing for today...");
                break;
            default :
                indexPage(b);
                break;
        }

    }

    private static void createClient(Bank b, UserInputManager userInpMan) {
        Client cli = userInpMan.retrieveClientInfo();

        if (cli == null) {
            System.out.println("\nInvalid input, try again...");
            createClient(b, userInpMan);
            return;
        }

        b.addClient(cli);

        System.out.println("\nClient created: " + cli);

        indexPage(b);
    }

    private static void createAccount(Bank b, UserInputManager userInpMan) {
        Client cli = getClient(b, userInpMan);

        if (cli == null) {
            System.out.println("\nInvalid input, try again...");
            createAccount(b, userInpMan);
            return;
        }

        Account account = userInpMan.retrieveTypeOfAcc();

        if (account == null) {
            System.out.println("\nInvalid input, try again...");
            createAccount(b, userInpMan);
            return;
        }

        cli.addAccount(account);

        System.out.println("\nAccount created for " + cli + ": " + account);
        indexPage(b);
    }

    private static void createTransaction(Bank b, UserInputManager userInpMan, Transaction.TypeOfTransac type) {
        Account account = getAccount(b, userInpMan);

        if (account == null) {
            System.out.println("\nInvalid input, try again...");
            createTransaction(b, userInpMan, type);
            return;
        }

        double amount = userInpMan.retrieveTransactionAmount();

        if (amount <= 0) {
            System.out.println("\nInvalid input, try again...");
            createTransaction(b, userInpMan, type);
            return;
        }

        if (type == Transaction.TypeOfTransac.DEPOSIT) {
            account.deposit(amount);
        } else if (type == Transaction.TypeOfTransac.WITHDRAWAL) {
            account.withdrawal(amount);
        }

        System.out.println("\nTransaction of type: " + type + "was successfully executed on the amount of: " + account + "");
        indexPage(b);
    }

    private static void listTransactions(Bank b, UserInputManager userInpMan) {

        Account account = getAccount(b, userInpMan);

        if (account == null) {
            System.out.println("\nInvalid input, try again...");
            listTransactions(b, userInpMan);
            return;
        }

        account.displayAllTransactions();

        System.out.println(account);
        indexPage(b);
    }

    private static void listClients(Bank b) {

        System.out.println("\nList of current clients:");

        b.displayClientList();
        indexPage(b);
    }

    private static void listAccounts(Bank b, UserInputManager userInpMan) {
        Client cli = getClient(b, userInpMan);

        if (cli == null) {
            System.out.println("\nInvalid input, try again...");
            listAccounts(b, userInpMan);
            return;
        }

        System.out.println("\nAccounts for " + cli + ":");
        b.displayClientAccounts(cli.getId());
        indexPage(b);
    }

    private static Client getClient(Bank b, UserInputManager userInpMan) {
        return b.getClient(userInpMan.retrieveClientId());
    }

    private static Account getAccount(Bank b, UserInputManager userInpMan) {
        return b.getClientAccount(userInpMan.retrieveClientId(), userInpMan.retrieveAccountNumber());
    }
}
