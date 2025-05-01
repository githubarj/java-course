import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        // inbuilt stack
        Stack nums = new Stack();

        nums.push(5);
        nums.push(6);
        nums.push(8);
        nums.push(35);

        System.out.println(nums);

        System.out.println(nums.pop());

    }
}
