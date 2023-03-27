public class mathOperations {
    public static void main(String[] args) {
        int num1 = 5, num2 = 9, res;
        float res1;

        //Sum
        res = num1 + num2;
        System.out.println("The sum of " + num1 + " + " + num2 +" = " + res);
    
        //Subtraction
        res = num1 - num2;
        System.out.println("The subtraction of " + num1 + " - " + num2 +" = " + res);

        //Multiplication
        res = num1 * num2;
        System.out.println("The multiplication of " + num1 + " X " + num2 +" = " + res);

        //Division
        //INTEGERS
        res = num2 / num1;
        System.out.println("The division of " + num2 + " / " + num1 +" = " + res);

         //REALS
         res1 = (float)num2 / (float)num1;
         System.out.println("The division of " + num2 + " / " + num1 +" = " + res1);
        
         //Module
         res = num2 % num1;
         System.out.println("The module of " + num2 + " % " + num1 +" = " + res);
        }
}
