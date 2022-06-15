package ch1.reinforcements;

public class R1_6 {

    public static int addOddN(int n){
        if (n <= 0) return 0;
        if ( n % 2 == 0) n--;
        int numOfTerms = (n + 1) /2;
        return (1 + n) * (numOfTerms) / 2;
    }

    public static void printResult(int n){
        System.out.printf("AddOddN %d: %d\n", n, addOddN(n));
    }

    public static void main(String[] args) {
        printResult(10);
        printResult(11);
        printResult(-1);
        printResult(0);
    }
}
