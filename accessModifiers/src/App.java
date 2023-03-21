public class App {

    /*
     * PUBLIC
     * Every class and constructor are "public", all public elements can be accessed
     * throughout the project.
     * 
     * PRIVATE
     * We only have access to the "private" elements within the class that was
     * declared.
     * 
     * PROTECT
     * When we do not define the access modifier as private or public, the element
     * has a modifier of "protected" by default, being possible access only in the
     * package itself
     * 
     */
    public static void main(String[] args) throws Exception {

        Client kaique = new Client("Kaique pires", "Rua Sorano, 142");
        Client bianca = new Client("Bianca França", "Rua codorna, 55");

        Account account_kaique = new Account(1, 100.0f, 200.0f, kaique);
        Account account_bianca = new Account(2, 300.0f, 500.0f, bianca);

        System.out.println("Kaique's balance(before cashing out): " + account_kaique.getBalance());
        System.out.println("Bianca's balance: " + account_bianca.getBalance());

        account_kaique.withdrawMoney(150);

        // In the encapsulation, the methods, attributes, etc. that cannot be changed
        // outside the business rule or logic proposed in the code
        // account_kaique.balance = 9000f; Not authorized

        System.out.println("Kaique's balance(after withdrawing the money): " + account_kaique.getBalance());

    }
}
