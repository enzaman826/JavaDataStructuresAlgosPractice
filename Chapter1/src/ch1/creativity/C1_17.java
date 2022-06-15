package ch1.creativity;


import java.util.Arrays;

public class C1_17 {

    public static boolean isEvenWithDistinctElements(int[] array){
        if (array.length > 1) {

            for (int i = 0; i < array.length; i++) {
                int numI = array[i];
                for (int j = i +1; j < array.length; j++){
                    int numJ = array[j];
                    if (numI != numJ && numI * numJ % 2 == 0) return true;
                }
            }
        }

        return false;

    }

    public static void printResult(int[] array){
        System.out.printf("isEvenWithDistinctElements(%s): %s\n", Arrays.toString(array)
                , isEvenWithDistinctElements(array));
    }

    public static void main(String[] args) {
        printResult(new int[] {1, 2, 3});
        printResult(new int[] {2,2,2});
        printResult(new int[] {});
    }
}
