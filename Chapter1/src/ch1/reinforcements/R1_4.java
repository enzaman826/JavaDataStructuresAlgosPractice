package ch1.reinforcements;

public class R1_4 {

    public static boolean isEven(int n){
//        if (n > 0){
//           while (n > 0){
//              n -= 2;
//           }
//
//        } else {
//           while (n < 0) {
//               n += 2;
//           }
//        }


        return (n & 0x1) == 0;
    }

    public static void printResult(int n){
        System.out.printf("Is %d even: %s\n", n, isEven(n));
    }

    public static void main(String[] args) {
       printResult(2);
       printResult(3);
       printResult(1004);
       printResult(101);
       printResult(0);
       printResult(-101);
       printResult(-100);
    }
}
