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
    
}
