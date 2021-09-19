package banking;

public class Client implements IClient {

    private int id;
    private String firstName;
    private String lastName;
    private static int counter = 0;
	private ArrayList<Account> accountList;

	public Client() {
		Client.incrementClientCount;
		this.id = this.counter;
		this.firstName = NULL;
		this.lastName = NULL;
		this.accountList = new ArrayList<Account>();
	}

	public void addAccount(Account newAccount) {
		this.accountList.add(newAccount);
	}

	public void displayAccounts() {
		System.out.println("List of accounts:\n" + this.accountList);
	}

	public Account getAccount(int accountNumber) {
		for(int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getAccountNumber() == accountNumber) {
				return accountList.get(i);
			}
		}
	}

	@Override
	String toString() {
		String output = "\nClient ID: " + this.id +
						"\nClient first name: " + this.firstName +
						"\nClient last name: " + this.lastName;
		return output;
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

    public static void incrementClientCount() {
        ++this.counter;
    }
    public static int getClientCount() {
        return this.counter;
    }

}
