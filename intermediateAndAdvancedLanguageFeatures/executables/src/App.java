import java.util.Scanner;

/*
 * Generating java executable
 * 
 *  JAR - Java Archive
 * 
 * Java Archive - Java compressed file
 * 
 * After creating the program select the option to export JAR
 */

public class App {

    static Client client = new Client("Kaique Pires", "Rua Sorano");
    static Account account = new Account(1, 200, 300, client);
    static Scanner keyboard = new Scanner(System.in);

    public static void deposit() {
        float amount;
        System.out.println("========== Deposit ==========");
        System.out.println("Enter the deposit amount");
        amount = keyboard.nextFloat();
        if (amount > 0) {
            account.cashDeposit(amount);
            System.out.println("Deposit made successfully.");
        } else {
            System.out.println("The deposit amount must be positive.");
        }
    }

    public static void toWithdraw() {
        float amount;
        System.out.println("========== Withdraw ==========");
        System.out.println("Enter the withdrawal amount");
        amount = keyboard.nextFloat();
        if (amount > 0) {
            account.withdrawMoney(amount);
            System.out.println("Withdrawal made successfully.");
        } else {
            System.out.println("The withdrawal amount must be positive.");
        }
    }

    public static void consult() {
        System.out.println(account.toString());

    }

    public static void main(String[] args) throws Exception {
        int option = 0;

        do {
            System.out.println("Welcome to Kaique's bank");
            System.out.println("Select an option below:");
            System.out.println("1 - Deposit");
            System.out.println("2 - To withdraw");
            System.out.println("3 - Check balance");
            System.out.println("0 - Exit");
            option = keyboard.nextInt();

            switch (option) {
                case 1:
                    deposit();
                    break;
                case 2:
                    toWithdraw();
                    break;
                case 3:
                    consult();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        } while (option > 0);
        keyboard.close();
    }
}
