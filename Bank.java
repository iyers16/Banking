package banking;

public class Bank implements IBank {

    private String bankNumber, address;

    public final void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }
    public String getBankNumber() {
        return this.bankNumber;
    }

    public final void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {

    }
    //void addClient(Client newClient);
    // void displayClientAccounts(int clientId);
    // void displayClientList();
    // Client getClient(int id);
}
