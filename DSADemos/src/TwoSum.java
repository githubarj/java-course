import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {5, 6, 25, 23, 25, 19};
        int target = 50;
        System.out.println(Arrays.toString(sumOfTwo(nums, target)));

    }

    public static int[] sumOfTwo(int[] arr, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < target) {
                int pair = target - arr[i];
                indices[0] = arr[i];
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] == pair) {
                        indices[1] = pair;
                        return indices;
                    }
                }
            }
        }
        return null;
    }
}
