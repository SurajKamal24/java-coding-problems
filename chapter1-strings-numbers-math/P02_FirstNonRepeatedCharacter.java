// "static void main" must be defined in a public class.
import java.util.*;
public class P02_FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatedCharacter("SSuraj"));
    }
    public static char firstNonRepeatedCharacter(String str){
        LinkedHashMap<Character, Integer> chars = new LinkedHashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            chars.compute(ch, (k,v) -> (v==null)?1:++v);
        }
        for(Map.Entry<Character, Integer> entry: chars.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return Character.MIN_VALUE;
    }
}