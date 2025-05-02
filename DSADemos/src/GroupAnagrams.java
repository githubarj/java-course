import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(anagramsOptimal(words));
    }

//    public static List<List<String>> groupAnagrams(String[] strs) {
//
//        // check if the array of strings is empty return an empty arraylist
//        if (strs.length == 0) {
//            return new ArrayList<>();
//        }
//
//        // create a hashmap to store the matched words from the array
//        // they should be matching with the alphabetical code we will create
//        Map<String, List<String>> map = new HashMap<>();
//
//        // create an array of 26 characters to create the code from
//        int[] count = new int[26];
//
//        // iterate over all the strings in the string array passed into the function
//        for (String s : strs) {
//
//            // for each iteration set the values back to 0 in the count array
//            Arrays.fill(count, 0);
//
//            // iterate over each character in each string
//            for (char c : s.toCharArray()) {
//                count[c - 'a']++; // c (representing a character ) - 'a' returns the index value of that character in the alphabet,
//                // and since we are at that index we then go up by one and by doing this for all
//                // characters in the word we create a code;
//            }
//
//            // create a stringbuilder to have a dynamic string that we can manipulate
//            StringBuilder sb = new StringBuilder();
//
//            // from our count we append the numbers into a string separating them with a #
//            for (int i = 0; i < 26; i++) {
//                sb.append("#");
//                sb.append(count[i]);
//            }
//
//            // we convert the stringbuilder to a string
//            String key = sb.toString();
//
//            // if the key we created does not yet exist in our hashmap we put it with an empty
//            // arraylist where we will put the words that will match
//            if (!map.containsKey(key)) {
//                map.put(key, new ArrayList<>());
//            }
//
//            // if the key exists, add the word to the existing array list
//            map.get(key).add(s);
//        }
//
//        // return the arraylist formed by the collection returned by map.values()
//        return new ArrayList<>(map.values());
//    }

    public static List<List<String>> anagramsOptimal(String[] strs) {
        Map<String, ArrayList<String>> ansMap = new HashMap<>();

        // looping over the words
        for (String s : strs) {
            char tempArray[] = s.toCharArray();
            Arrays.sort(tempArray); // this will sort the created array using the unicode,
            // therefore capital letters first in alphabetical order and then small letters in alphabetical order too

            String key = new String(tempArray); // set the now ordered string as the key to
            // compare since if something is an anagram having the same letters will mean
            // it will produce the same ordered string,

            ansMap.putIfAbsent(key, new ArrayList<String>()); // then we put into the map the keys
            // only if the key does not exist yet since we are looping over

            ansMap.get(key).add(s); // for the keys that already exist add a value to its
            // Arraylist<String>
        }
        return new ArrayList<>(ansMap.values()); // return the values of the map put into an ArrayList
    }


}
