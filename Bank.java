package banking;

public class Bank implements IBank {

	private String bankNumber, address;
	private ArrayList<Client> clientList;

	public Bank() {
		this.bankNumber = null;
		this.address = null;
		this.clientList = new ArrayList<Client>();
	}

	public void addClient(Client newClient) {
		this.clientList.add(newClient);
	}

	public void displayClientAccounts(int clientId) {
		getClient(clientId).displayAccounts();
	}

	public void displayClientList() {
		System.out.println("List of clients:\n" + this.clientList);
	}

	public Client getClient(int id) {
		// for(int i = 0; i < clientList.size(); i++) {
		// 	if(clientList.get(i).getID() == id) {
		// 		return clientList.get(i);
		// 	}
		// }
		return null;
	}

	public Account getClientAccount(int clientId, int accountNumber) {
		// return this.getClient(clientId).getAccount(accountNumber);
		return null;
	}

	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}
	public String getBankNumber() {
		return this.bankNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return this.address;
	}

}
