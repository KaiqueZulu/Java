
public class App {
    public static void main(String[] args) throws Exception {
        //Static attributes
        Account account1 = new Account("Kaique Pires");
        Account account2 = new Account("Bianca Franca");
        
        System.out.println(account1.get_id());
        System.out.println(account1.getClient());
    
        System.out.println(account2.get_id());
        System.out.println(account2.getClient());

        //How to access static attributes
        System.out.println(Account.counter);
        
        //Using static methods
        System.out.println(Account.nextAccount());
    }
}
