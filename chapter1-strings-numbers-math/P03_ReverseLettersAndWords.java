// "static void main" must be defined in a public class.
import java.util.*;
public class P03_ReverseLettersAndWords {
    public static void main(String[] args) {
        System.out.println(reverseLettersAndWords("Suraj Kamal"));
    }
    public static String reverseLettersAndWords(String str){
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for(String word :  words){
            StringBuilder reverseWord = new StringBuilder();
            for(int i = word.length()-1; i>=0; i--){
                reverseWord.append(word.charAt(i));
            }
            reversedString.append(reverseWord).append(" ");
        }
        return reversedString.reverse().toString();
    }
}