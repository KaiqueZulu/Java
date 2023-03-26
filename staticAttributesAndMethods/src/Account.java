/*
 * Static attributes are attributes whose values ​​are shared between class instances.
 */

public class Account {
    private int _id;
    private String client;

    // Static attribute
    public static int counter = 1;

    public Account(String client) {
        this._id = counter;
        this.client = client;

        // Iterating over the static attribute in the class
        Account.counter++;
    }

    public String getClient() {
        return client;
    }

    public int get_id() {
        return _id;
    }

    /*
     * A static method does not depend on an instance of the class to be used.
     * 
     * It can be used as follows:
     * 
     * ClassName.method()
     */

    public static int nextAccount() {
        return counter;
    }
}
