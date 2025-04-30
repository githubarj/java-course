import java.util.LinkedList;

public class Linked {
    public static void main (String[] args) {

        LinkedList nums = new LinkedList();

        nums.add(5);
        nums.add(6);

        nums.addFirst(8);

        System.out.println(nums.get(2)); // gets the element at this index

        System.out.println(nums.peek());

        System.out.println(nums);
    }
}
