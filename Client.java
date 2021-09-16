package banking;

public class Client implements IClient {

    private int id;
    private String firstName;
    private String lastName;
    private static int counter = 0;

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
