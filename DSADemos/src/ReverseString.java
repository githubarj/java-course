import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(reverse(str));
        int[] nums = {2, 3, 13, 25, 13};
        System.out.println(Arrays.toString(reverseArray(nums)));
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int[] reverseArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;

        }
        return nums;
    }


}
