package ch1.creativity;

public class C1_19 {

    public static void repeatDivide(int num, int divisor){

        int current = num;
        int divideCount = 0;
        do {
            System.out.println("current = " + current);
            current /= divisor;
            divideCount++;
        } while (current >= divisor);

        System.out.println("divideCount = " + divideCount);
    }

    public static void repeatDivide(int num){
        repeatDivide(num, 2);
    }

    public static void main(String[] args) {
        repeatDivide(12);
        repeatDivide(12, 3);
    }
}
