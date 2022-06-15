package ch1.creativity;

import java.util.Arrays;

public class C1_18 {

    public static double norm(double [] vector, int p) {

      double sum =  Arrays.stream(vector).map(num -> Math.pow(num, p)).sum();
      return Math.pow(sum, 1d/p);
    }

    public static double norm(double [] vector){
        return norm(vector, 2);
    }


    public static void main(String[] args) {

        double[] vector1 = {1.0, 1.0, 1.0, 1.0};
        double[] vector2 = {2.0, 2.0};

        System.out.println(norm(vector1, 2));
        System.out.println(norm(vector1));
        System.out.println(norm(vector2,4));
    }
}
