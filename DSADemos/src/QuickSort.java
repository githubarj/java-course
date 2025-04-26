import java.util.Arrays;

public class QuickSort {
    public static void main (String[] args){
        int[] nums = {4, 5, 3, 23, 89, 34, 12, 6, 1};

        System.out.println("The sorted array through quick sort is: \n" +
                Arrays.toString(
                        quickSort(nums, 0, nums.length -1 )
                ));

    }

    public static int[] quickSort(int[] nums, int low, int high) {

        if ( low < high) {
            int pivotIndex = partition(nums, low, high);
            quickSort(nums, low, pivotIndex -1 );
            quickSort(nums, pivotIndex + 1, high);
        }

        return nums;
    }

    public static int partition(int[] nums, int low, int high){
        int pivot = nums[high]; // last element
        int i = low - 1; // index for elements lower than  the pivot

        for ( int j = low; j < high; j ++) {
            if (nums[j] <= pivot){
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i+ 1, high);
        return i + 1;
    }
    public static void swap(int[] nums, int a ,int b){
        int temp =  nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
