//done

import java.util.ArrayList;

public class Client implements IClient {
    
    private int id;
    private String firstName;
    private String lastName;
    private static int counter = 0;
    private ArrayList<Account> accountList = new ArrayList<>();
    
    public Client(String fn, String ln) {
        ++Client.counter;
        this.id = Client.counter;
        this.firstName = fn;
        this.lastName = ln;
    }

    public void addAccount(Account source) {
        source.setOwner(this);
        this.accountList.add(source);
    }

    public void displayAccounts() {
        for (Account account : accountList) {
            System.out.println(account);
        }
    }

    public Account getAccount(int accNum) {
        Account acc = this.accountList.stream()
                                    .filter(account -> account.getAccountNumber() == (accNum))
                                    .findFirst()
                                    .orElse(null);
        return acc;
    }

    public ArrayList<Account> getAccounts() {return this.accountList;}
    public void setAccounts(ArrayList<Account> source) {this.accountList = source;}

    public int getId() {return this.id;}
    public void setId(int source) {this.id = source;}
    
    public String getFirstName() {return this.firstName;}
    public void setFirstName(String source) {this.firstName = source;}
    public String getLastName() {return this.lastName;}
    public void setLastName(String source) {this.lastName = source;}
    
    public int getClientCount() {return Client.counter;}
    
    @Override
    public String toString() {
        return " (" + this.id + ") " + this.lastName + ", " + this.firstName;
    }
}
