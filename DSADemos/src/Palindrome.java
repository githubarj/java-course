public class Palindrome {
    public static void main(String[] args) {
        String word = "racecar";
        System.out.println(checkIfPalindrome(word));
    }


    public static boolean checkIfPalindrome(String word) {
        String cleaned = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        return new StringBuilder(cleaned).reverse().toString().strip().equals(cleaned);
    }
}
