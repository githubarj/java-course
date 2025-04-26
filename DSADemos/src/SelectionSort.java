import java.util.Arrays;

public class SelectionSort {
    public static void main (String[] args) {
        int [] nums = { 5, 6, 2, 8, 12, 10, 7, 3};

        System.out.println("The sorted array through selection sort is\n" + Arrays.toString(selectionSort(nums)));

    }
    // implementing it by starting with the smallest value
    public static int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1  ; i++) {
            // Assume that the current unsorted element is the smallest
            int minIndex = i;
            for ( int j = i + 1 ; j < nums.length; j ++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j; // update the minIndex is a smaller value is found.
                }
            }
            // swap the now smallest element with the element in the current position.
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}


// we loop over the entire array, and for each element in the array we compare with all the other
// elements to either find the smallest or biggest, then we move it either to the front
// or back of the array depending, then go to the next etc.
// for the inner loop  we check using a minIndex, we assume minIndex is the current unsorted
// element, then compare it across the loop and replace it when we find something smaller
// by the end of the inner loop we have our smallest/largest element
// so the inner loop starts from the next element, which means, i + 1 and will end when only one element is left
// so it should end at nums.length
