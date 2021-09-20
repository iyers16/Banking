package banking;

public class Client implements IClient {

    private int id;
    private String firstName;
    private String lastName;
    private static int counter = 0;
		private ArrayList<Account> accountList;

	public Client() {
		++Client.counter;
		this.id = Client.counter;
		this.firstName = null;
		this.lastName = null;
		this.accountList = new ArrayList<Account>();
	}

		public void addAccount(Account newAccount) {
			this.accountList.add(newAccount);
		}

		public void displayAccounts() {
			System.out.println("List of accounts:\n" + this.accountList);
		}

	public Account getAccount(int accountNumber) {
        // for(int i = 0; i < accountList.size(); i++) {
        //     if(accountList.get(i).getAccountNumber() == accountNumber) {
        //         return accountList.get(i);
        //     }
        // }
        return null;
	}

	@Override
	public String toString() {
		// String output = "\nClient ID: " + this.id +
		// 				"\nClient first name: " + this.firstName +
		// 				"\nClient last name: " + this.lastName;
		// return output;
        return null;
	}

    public final void setID(int id) {
        this.id = id;
    }
    public int getID() {
        return this.id;
    }

    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }

    public static int getClientCount() {
        return Client.counter;
    }

}
