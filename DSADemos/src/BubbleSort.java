import java.util.Arrays;

public class BubbleSort {
    public static void main (String[] args) {
        int[] nums = {5, 3, 9, 7, 12, 26, 1, 10, 2};
        int[] result = bubbleSort(nums);
        System.out.println("The sorted array is: " +  Arrays.toString(result));

    }

    public static int[] bubbleSort (int[] nums) {
        for (int j = nums.length - 1; j > 0 ; j--){
            for (int i  = 0; i < j ; i++ ) {
                if(nums[i] > nums[i+1]){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i + 1] = temp;
                }
            }
        }
        return nums;
    }
}
