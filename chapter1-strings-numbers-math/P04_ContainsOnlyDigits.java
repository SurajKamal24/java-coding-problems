// "static void main" must be defined in a public class.
import java.util.*;
public class P04_ContainsOnlyDigits {
    public static void main(String[] args) {
        System.out.println(containsOnlyDigits("1234567890S"));
    }
    public static boolean containsOnlyDigits(String str){
        for(int i=0; i<str.length(); i++){
			if(!Character.isDigit(str.charAt(i))){
				return false;
			}
		}
		return true;
    }
}