//done

import java.util.ArrayList;

public class Bank implements IBank {

    private String bankNumber;
    private String address;
    private ArrayList<Client> clientList = new ArrayList<>();
    
    public Bank(String bnum, String adds) {
        this.bankNumber = bnum;
        this.address = adds;
    }

    public void displayClientList() {
        for (Client client : clientList) {
            System.out.println(client);
        }
    }

    public Client getClient(int id) {
        Client cli = this.clientList.stream()
                                    .filter(client -> client.getId() == (id))
                                    .findFirst()
                                    .orElse(null);
        return cli;
    }

    public ArrayList<Client> getClients() {return this.clientList;}
    public void addClient(Client source) {this.clientList.add(source);}
    public void setClients(ArrayList<Client> source) {this.clientList = source;}
    public void displayClientAccounts(int cid) {getClient(cid).displayAccounts();}
    public Account getClientAccount(int cid, int accn) {return getClient(cid).getAccount(accn);}
    
    public String getBankNumber() {return this.bankNumber;}
    public void setBankNumber(String source) {this.bankNumber = source;}
    
    public String getAddress() {return this.address;}
    public void setAddress(String source) {this.address = source;}
}
