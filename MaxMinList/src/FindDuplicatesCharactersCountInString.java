import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicatesCharactersCountInString {
    public static void main(String[] args){
        String str = "krishna sokinola";

        char[] chars = str.toCharArray(); // k r i s h n a space s a k i n o l a

        Map<Character, Integer> charMap = new HashMap<>();
        //logic --> Characters are inserted as Keys and the respective count inserted as Values.
        //If map aldready contains the character then increase the value by 1.
        for(Character ch: chars){

            if(charMap.containsKey(ch)){
                charMap.put(ch,charMap.get(ch) +1); // (k,1)
            }
            else{
                charMap.put(ch,1);
            }
        }

        //loop through only Keys
        Set<Character> keys = charMap.keySet();
        for( Character ch:keys){
            if(charMap.get(ch) > 1){
                System.out.println("Character " + ch + "repeating "+ charMap.get(ch) + " times");
            }
        }

    }
}
