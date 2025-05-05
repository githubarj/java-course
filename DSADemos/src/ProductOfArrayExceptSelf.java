import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(
                func(nums)
        ));
    }

//    public static int[] func(int[] nums) {
//        int[] ans = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            int product = 1;
//            for (int j = 0; j < nums.length; j++) {
//                if (j != i) {
//                    product = product * nums[j];
//                }
//            }
//            ans[i] = product;
//        }
//        return ans;
//    }

    public static int[] func(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];


        // build the prefix
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }

        return ans;
    }


}
