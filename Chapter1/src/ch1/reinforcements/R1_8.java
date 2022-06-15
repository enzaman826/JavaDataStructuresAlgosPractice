package ch1.reinforcements;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class R1_8 {


    private static final List<Character> vowelAsciiCodes = Collections.unmodifiableList(
                                    Arrays.asList('a','e', 'i', 'o', 'u',
                                        'A', 'E','I', 'O', 'U'));
    public static boolean isVowel(Character c){
        return vowelAsciiCodes.contains(c);
    }
    public static long countVowels(String word){
        return word.chars().mapToObj(ch -> (char) ch).filter(R1_8::isVowel).count();
    }
    public static void printResult(String word){
        System.out.printf("countVowels(%s): %d\n", word, countVowels(word));
    }

    public static void main(String[] args) {
        Arrays.asList("Nihal", "Adrian", "Kevin", "Simeon", "Alan","Andre").forEach(R1_8::printResult);
    }
}
