import java.util.Scanner;

/*
 * When we talk about exceptions in java, we understand it as follows:
 * 
 * checked exceptions(Less dangerous):
 *  - Exception;
 *  - IOException;
 *  - SQLException.
 * 
 * Checked exceptions cause the program not to run until the specified exception is handled.
 * 
 * Unchecked exceptions(Most dangerous):
 *  - RuntimeException;
 *  - NullPointerException;
 *  - ArrayOutOfBoundsException.
 * 
 * Exceptions of the "unchecked" type only happen during program execution, so we have no way of knowing, in most cases, where it might occur.
 */

public class App {
    public static void main(String[] args) throws Exception {
        // Error handler syntax example

        int numbers[] = new int[5];
        for (int counter = 0; counter < numbers.length; counter++) {
            numbers[counter] = (counter + 3) * 2;
        }

        try {
            // Array goes to index 4, if it is " <=" it goes to 5 causing the error.
            for (int counter = 0; counter <= numbers.length; counter++) {
                System.out.println(numbers[counter]);
            }
        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
        } finally {
            System.out.println("FINALLY: Continue the program regardless of whether you made a mistake or not");
        }

        System.out.println("Program ended execution correctly, without crashing on error");


        //Syntax example of functions that can throw errors

        Scanner keyboard = new Scanner(System.in);
        int number1, number2;

        System.out.println("Enter the first number");
        number1 = keyboard.nextInt();

        System.out.println("Enter the second number");
        number2 = keyboard.nextInt();

        try {
            System.out.println(division(number1, number2));
        } catch (Exception error) {
            System.out.println("Unable to perform the operation");
        }

       keyboard.close();
    }
    //Method that can throw an exception
        public static int division(int number1, int number2) throws Exception{
        return number1/ number2;
    }
}
