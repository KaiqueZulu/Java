import java.util.Scanner;

public class function {
    static int amount;
    static String fruits[];
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Enter the quantity of fruits to register: ");
        amount = Integer.parseInt(keyboard.nextLine());
        register_fruits(amount);
        print_fruits_in_reverse_order(fruits);

        keyboard.close();
    }

    static void register_fruits(int amount) {
        fruits = new String[amount];

        for (int interactor = 0; interactor < amount; interactor++) {
            System.out.println("Enter the " + (interactor + 1) + "° fruit:");
            fruits[interactor] = keyboard.nextLine();
        }
    }

    static void print_fruits_in_reverse_order(String[] fruits) {
        for (int interactor = 0; interactor < amount; amount--) {
            System.out.println(fruits[amount - 1]);
        }
    }
}
