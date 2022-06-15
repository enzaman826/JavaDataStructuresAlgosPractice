package ch1.creativity;

public class C1_15 {

    /*
        Method to print the smallest/largest integer in an array of integers
        declare two variables
        smallest = Infinity
        largest = - Infinity

        loop through each number and compare them to smallest and largest
        update smallest and largest while iterating
        print smallest/largest at then end of the method


     */

    public static void printSmallestAndLargestNum(int[] array){
        if (array.length >= 1) {

            int smallest = Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE;

            for (int num : array){
                if (num < smallest) smallest = num;
                if (num > largest) largest = num;
            }

            System.out.println("smallest = " + smallest);
            System.out.println("largest = " + largest);
        } else{
            System.out.println("Array is empty");
        }


    }

    public static void main(String[] args) {
        printSmallestAndLargestNum(new int[] {0, 1, 2, 4, 5, 9, 1});
        printSmallestAndLargestNum(new int[0]);
        printSmallestAndLargestNum(new int[] {9, 8, 7, -1});

    }
}
