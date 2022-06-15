package ch1.reinforcements;

public class R1_3 {

    public static boolean isMultiple(long n, long m){
         if (m == 0) {
             return false;
         }
         else{
             return n % m == 0;
         }
    }
    public static void printResult(long n, long m){
        boolean result = isMultiple(n, m);
        System.out.printf("Is %d a multiple of %d: %s\n", n, m, result);
    }

    public static void main(String[] args) {
        printResult(10, 5);
        printResult(10, 0);
        printResult(21, 2);
        printResult(0, 10);
    }

}
