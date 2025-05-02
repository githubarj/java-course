import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 2};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }

//    public static int[] sumOfTwo(int[] arr, int target) {
//        int[] indices = new int[2];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < target) {
//                int pair = target - arr[i];
//                indices[0] = arr[i];
//                for (int j = i; j < arr.length; j++) {
//                    if (arr[j] == pair) {
//                        indices[1] = pair;
//                        return indices;
//                    }
//                }
//            }
//        }
//        return null;
//    }
//
//    // the above is 0(n^2) quadratic time which is bad

    // we will use a hashmap to get factorial time O(n)

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

}



