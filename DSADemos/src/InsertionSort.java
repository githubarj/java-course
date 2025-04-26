import java.util.Arrays;

public class InsertionSort {
    public static void main (String[] args) {
        int [] nums = { 5, 6, 2, 8, 12, 10, 7, 3};
        System.out.println("The sorted array using insertion sort is\n" + Arrays.toString(insertionSort(nums)));
    }
    public static int[] insertionSort(int[] nums){
        for (int i = 1; i < nums.length; i++){
            int key = nums[i];
            int j = i -1;

         while(j>= 0 && nums[j] > key){
             nums[j+1] = nums[j];
             j--;
         }
         nums[j + 1] = key;
        }
        return nums;
    }
}
