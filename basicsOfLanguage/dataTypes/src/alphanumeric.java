//Characters and strings
public class alphanumeric {
    public static void main(String[] args) {
        // Primary / primitive
        char letter1 = 'a'; // 16 bits UTF-16 From 0 to 65535 (including) - from '\u0000' to '\uffff'
        char letter2 = 97; // 97 in decimal == 'a'
        char letter3 = (char) (letter2 + 1); // Cast / 97 + 1 == 98 in decimal == 'b'

        // Not primary / Not primitive (primary classes)
        Character letter4 = 'A'; // Char does not accept double quotes, only single quotes. Double quotes are for
                                 // Strings only
        String letter5 = "Kaique";

        System.out.println("Letter HardCode = " + letter1);
        System.out.println("Letter ASCII = " + letter2);
        System.out.println("Letter ASCII with sum = " + letter3);
        System.out.println("Letter Not primary / Not primitive = " + letter4);
        System.out.println("String = " + letter5);

        // Size of character
        System.out.println("Size of character \n");

        System.out.println("char/Char " + Character.SIZE + " bits");
        System.out.println("String " + letter5 +" "+ (Character.SIZE * letter5.length()) + " bits");

    }
}
