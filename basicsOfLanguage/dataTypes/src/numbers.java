//Integers and reals
public class numbers {
    public static void main(String[] args) throws Exception {
        // INTEGERS
        // Primary / primitive
        long num1 = 99; // Integer 64 bits
        int num2 = 4; // Integer 32 bits
        short num3 = 4; // Integer (short / smaller / low) 16 bits
        byte num4 = 4; // 8 bits

        // Not primary / Not primitive (primary classes)
        Long num5 = (long) 999999999; // Cast
        Integer num6 = 98;
        Short num7 = 7;
        Byte num8 = 9;

        System.out.println("INTEGERS \n");

        System.out.println("long = " + num1);
        System.out.println("int = " + num2);
        System.out.println("short = " + num3);
        System.out.println("byte = " + num4);
        System.out.println("Long Class = " + num5);
        System.out.println("Integer Class = " + num6);
        System.out.println("Short Class = " + num7);
        System.out.println("Bytes Class = " + num8 + "\n");

        // -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-

        // REALS
        // Primary / primitive
        // By default , real numbers in java are considered double
        float price1 = 23.4f; // 23,40 32 bits
        double price2 = 23.4; // 23,4... 64 bits

        // Not primary / Not primitive (primary classes)
        Float price3 = 44.5f;
        Double price4 = 44.5;

        System.out.println("REALS \n");
        System.out.println("float = " + price1);
        System.out.println("double = " + price2);
        System.out.println("Float = " + price3);
        System.out.println("Double = " + price4 + "\n");

        // Size of numbers
        System.out.println("Size of numbers \n");

        System.out.println("long/Long " + Integer.SIZE + " bits");
        System.out.println("int/Integer " + Integer.SIZE + " bits");
        System.out.println("short/Short " + Short.SIZE + " bits");
        System.out.println("byte/Byte " + Byte.SIZE + " bits");
        System.out.println("float/Float " + Float.SIZE + " bits");
        System.out.println("double/Double " + Double.SIZE + " bits \n");

        // Min and max of numbers
        System.out.println("Min and max of numbers \n");

        System.out.println("Value Min long/Long " + Long.MIN_VALUE);
        System.out.println("Value Max long/Long " + Long.MAX_VALUE);
        System.out.println("Value Min int/Integer " + Integer.MIN_VALUE);
        System.out.println("Value Max int/Integer " + Integer.MAX_VALUE);
        System.out.println("Value Min short/Short " + Short.MIN_VALUE);
        System.out.println("Value Max short/Short " + Short.MAX_VALUE);
        System.out.println("Value Min byte/Byte " + Byte.MIN_VALUE);
        System.out.println("Value Max byte/Byte " + Byte.MAX_VALUE);
        System.out.println("Value Min float/Float " + Float.MIN_VALUE);
        System.out.println("Value Max float/Float " + Float.MAX_VALUE);
        System.out.println("value Min double/Double " + Double.MIN_VALUE);
        System.out.println("value Max double/Double " + Double.MAX_VALUE);

    }
}
