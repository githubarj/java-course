import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class EncodingDecoding {
    public static void main(String[] args) {
        Vector<String> message = new Vector<>(Arrays.asList("Apple", "Banana", "Cherry"));

        String encrypted = encode(message);
        System.out.println(encode(message));
        System.out.println(decode(encrypted));


    }

    public static String encode(Vector<String> strs) {

        return String.join("#", strs);
    }

    public static Vector<String> decode(String str) {
        
        String[] split = str.split("#");

        return new Vector<>(Arrays.asList(split));
    }
}
