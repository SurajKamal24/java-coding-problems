// "static void main" must be defined in a public class.
import java.util.HashMap;
public class P01_CountDuplicateCharacters {
    public static void main(String[] args) {
        System.out.println(countDuplicateCharacters("Suraj"));
    }
    public static HashMap<Character, Integer> countDuplicateCharacters(String str){
        HashMap<Character, Integer> result = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            result.compute(ch, (k,v) -> (v==null)?1:v++);
        }
        return result;
    }
}