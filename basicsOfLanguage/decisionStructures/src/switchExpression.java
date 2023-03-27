public class switchExpression {
    public static void main(String[] args) {
        int number = 7;
        switch (number) {
            case 0:
                System.out.println("The number is 0");

                break;
            case 3:
                System.out.println("The number is 3");

                break;
            case 5:
                System.out.println("The number is 5");

                break;
            default:
                System.out.println("The number is " + number);
                break;
        }
    }
}
