package ch1.creativity;

import java.util.Arrays;

public class C1_14 {

    /*
        Method to reverse a list of integers.
        If list.size >= 2
            create two pointer variables i = 0, j = list.size -1
            while i < j
               swap(list, i, j);
               i++;
               j--;


     */


    public static void reverseIntArray(int[] array){

        if (array.length > 2){

            int i = 0, j = array.length -1;

            while ( i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
    }

    public static void printResult(int[] array){
        reverseIntArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        printResult(new int[0]);
        printResult(new int[] {2, 3, 4});
        printResult(new int[] {1});
        printResult(new int[] {4, 3});


    }
}
