import java.util.HashMap;
import java.util.Map;

public class HashMapGeneric {
  public static void main(String[] args) {
    // <Key, value>
    Map<String, Account> accounts = new HashMap<String, Account>(); // Does not accept duplicate keys

    Client clientOne = new Client("Kaique", "Street One");
    Client clientTwo = new Client("Bianca", "Street Two");

    Account clientOneAccount = new Account(1, 200, 300, clientOne);
    Account clientTwoAccount = new Account(2, 400, 700, clientTwo);

    accounts.put("Physical person", clientOneAccount);
    accounts.put("Legal person", clientTwoAccount);

    System.out.println(accounts.get("Physical person"));
    System.out.println(accounts.get("Legal person"));

  }
}
