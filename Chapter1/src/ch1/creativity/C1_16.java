package ch1.creativity;

import java.util.Scanner;
import java.util.stream.IntStream;

public class C1_16 {


    public static boolean validateSum(int a, int b, int c){
        return c == a + b;
    }
    public static boolean validateDiff(int a, int b, int c){
        return a == b -c;
    }

    public static boolean validateProduct(int a, int b, int c){
        return c == a * b;
    }
    public static void run(){

        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a integer for a: ");
        a = scanner.nextInt();
        System.out.print("Enter a integer for b: ");
        b = scanner.nextInt();
        System.out.print("Enter a integer for c: ");
        c = scanner.nextInt();

        System.out.printf("%d + %d = %d is a %s statement\n", a, b, c,validateSum(a, b, c));
        System.out.printf("%d = %d - %d is a %s statement\n", a,b,c,validateDiff(a, b, c));
        System.out.printf("%d * %d = %d is a %s statement\n", a,b,c,validateProduct(a, b, c));





    }

    public static void main(String[] args) {

        int runs = 2;

        for (int i = 0; i < runs; i++)
            run();

    }

}
