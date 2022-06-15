package ch1.reinforcements;

public class R1_5 {

    public static int sumN(int n){
        if ( n <= 0) return 0;

        return n * (n + 1) / 2;
    }

    public static void printResult(int n){
        System.out.printf("SumN %d : %d\n", n, sumN(n));
    }

    public static void main(String[] args) {
        printResult(100);
        printResult(-1);
        printResult(500);
        printResult(0);
        printResult(10);
    }
}
