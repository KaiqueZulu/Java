import java.util.Scanner;

public class whileDoWhile {
    public static void main(String[] args) throws Exception {
        int age = 1;
        String name;
        // To receive user data via keyboard
        Scanner keyboard = new Scanner(System.in);

        // while (age > 0) {
        // System.out.println("Enter your name: ");
        // name = keyboard.nextLine();
        //
        // System.out.println("Enter your age: ");
        // //age = keyboard.nextInt(); //BUG
        // age = Integer.parseInt(keyboard.nextLine());
        //
        // System.out.println(name + " is " + age + " years old");
        // }

        //First run and then check

        do {
            System.out.println("Enter your name: ");
            name = keyboard.nextLine();

            System.out.println("Enter your age: ");
            // age = keyboard.nextInt(); //BUG
            age = Integer.parseInt(keyboard.nextLine());

            System.out.println(name + " is " + age + " years old");
        } while (age > 0);

        keyboard.close();
    }
}
