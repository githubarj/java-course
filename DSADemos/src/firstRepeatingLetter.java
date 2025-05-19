import java.util.HashMap;
import java.util.LinkedHashMap;

public class firstRepeatingLetter {
    public static void main(String[] args) {
        String in = "Stress";


    }

    public static String firstNonRepeatingCharacter(String input) {
        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            char lowerCaseChar = Character.toLowerCase(c);
            map.put(lowerCaseChar, map.getOrDefault(lowerCaseChar, 0) + 1);
        }

        for (char c : input.toCharArray()) {
            if (map.get(Character.toLowerCase(c)) == 1) {
                return String.valueOf(c);
            }
        }
        return "";
    }
}
