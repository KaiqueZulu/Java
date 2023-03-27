import java.util.Scanner;

public class forAndForeach {
    public static void main(String[] args) {
        int age = 1;
        String name, institution = "Geek University";
        // To receive user data via keyboard
        Scanner keyboard = new Scanner(System.in);

        //For
        for (int i = 0; i < 1; i++) {

            System.out.println("Enter your name: ");
            name = keyboard.nextLine();

            System.out.println("Enter your age: ");
            // age = keyboard.nextInt(); //BUG
            age = Integer.parseInt(keyboard.nextLine());

            if (age > 0) {
                System.out.println(name + " is " + age + " years old");
            }
            
        }

        //Foreach
        for(char letter : institution.toCharArray()){
            System.out.println(letter);
        }


        keyboard.close();
    }
}
