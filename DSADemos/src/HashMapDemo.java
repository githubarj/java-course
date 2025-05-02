import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        //a data structure that stores key-value pairs
        // Keys are unique but values can be duplicated
        // Does not maintain any order but is memory efficient
        // HashMap<Key, Value>


        // declare a hashmap you have to declare the type of the key and value at initialization
        HashMap<String, Double> map = new HashMap<>();

        // to put things in a hashmap you use put
        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);

        // if you have a duplicate key you will override the previous value, it is useful for changing the value of a key
        map.put("coconut", 1.89);

        // you can remove an element by using remove and passing the key
        map.remove("apple");

        // to get returned a value of an item this will return the value of the banana key
        System.out.println(map.get("banana"));

        // to check if an item exists, returns true or false
        System.out.println(map.containsKey("apple"));
        // we can use this in a condition like an if statement
        if (map.containsKey("orange")) {
            System.out.println("The price of an orange is " + map.get("orange"));
        }

        // we can also check if a hashmap contains a value and it has to be of the same data type
        System.out.println(map.containsValue(0.75));

        // You can also get the size of a hashmap
        System.out.println(map.size());


        System.out.println(map);

        // looping over values in the hashmap
        for (String key : map.keySet()) {
            System.out.println(key + " : £" + map.get(key));
        }
    }

}
