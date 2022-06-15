package ch1.reinforcements;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class R1_9 {

    private static final List<Character> punctuations = Collections.unmodifiableList(Arrays.asList(
        '.', ':', '!','?',',', '\'', '\"'
    ));
    public static String removePunctuation(String str){
       StringBuilder sb = new StringBuilder() ;
       for (char c: str.toCharArray()){
           if (!punctuations.contains(c)){
              sb.append(c);
           }
       }

       return sb.toString();

    }

    public static void printResult(String str){
        System.out.printf("Before: %s, After %s\n", str, removePunctuation(str));
    }

    public static void main(String[] args) {
       Arrays.asList(
              "Nihal: is testing something interesting.1!!" ,
              "Alan: is sleeping right now??" ,
              "Simeon is working out right now!??',:."


       ).forEach(R1_9::printResult);
    }
}
