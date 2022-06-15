package ch1.reinforcements;

public class R1_7 {

    public static int squareSums(int n){
       if (n <= 0) return 0;

       return n * (n + 1) * (2*n + 1) /6;
    }


    public static void printResult(int n){
        System.out.printf("SquareSums(%d): %d\n", n, squareSums(n));
    }
    public static void main(String[] args){
       for (int i = 0; i <= 10; i++){
           printResult(i);
       }
    }
}
