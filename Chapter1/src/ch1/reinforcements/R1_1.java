package ch1.reinforcements;

import java.util.Scanner;

public class R1_1 {

    public static void inputAllBaseTypes(){



        //create Scanner to read from standard input
        Scanner scanner = new Scanner(System.in);
        //read byte
        System.out.print("Enter a value for a byte: ");
        byte inputByte = scanner.nextByte();

        //read short
        System.out.print("Enter a value for a short: ");
        short inputShort = scanner.nextShort();

        //read int
        System.out.print("Enter a value for a int: ");
        int inputInt = scanner.nextInt();

        //read long
        System.out.print("Enter a value for a long: ");
        long inputLong = scanner.nextLong();

        //read float
        System.out.print("Enter a value for a float: ");
        float inputFloat = scanner.nextFloat();

        //read double
        System.out.print("Enter a value for a double: ");
        double inputDouble = scanner.nextDouble();

        //read boolean
        System.out.print("Enter a value for a boolean: ");
        boolean inputBoolean = scanner.nextBoolean();

        //read char
        System.out.print("Enter a value for a char: ");
        char inputChar = scanner.next().charAt(0);
        scanner.close();

        System.out.println("Finished collecting inputs");

        System.out.println("\tinputByte = " + inputByte);
        System.out.println("\tinputShort = " + inputShort);
        System.out.println("\tinputInt = " + inputInt);
        System.out.println("\tinputLong = " + inputLong);
        System.out.println("\tinputFloat = " + inputFloat);
        System.out.println("\tinputDouble = " + inputDouble);
        System.out.println("\tinputBoolean = " + inputBoolean);
        System.out.println("\tinputChar = " + inputChar);

    }


    public static void main(String[] args) {

        inputAllBaseTypes();
    }
}
