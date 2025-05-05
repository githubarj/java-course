import java.util.Arrays;
import java.util.HashSet;

public class LongestConsequtiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 3, 2, 1, 1005};
        System.out.println(func(nums));
    }

    public static int func(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        // create a hashset that means no repeating numbers
        HashSet<Integer> set = new HashSet<>();

        // add all the numbers in the original array into the set
        for (int n : nums) {
            set.add(n);
        }

        // initialize the max length variable
        int maxLength = 0;

        // iterate over each number in the set,
        for (int num : set) {

            // if the set contains a number just one higher than the current num
            if (!set.contains(num - 1)) {

                // set currentNum to the number at our current iteration
                int currentNum = num;
                // set the length to a temp variable starting it at one
                int currentLength = 1;

                // while the set contains a number that is one value higher than current
                // current++ and also increase length, so this while will exit once no
                // number is just one above current

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                // set maxLength to the larger length between the currently iterated and the one set
                maxLength = Math.max(maxLength, currentLength);
            }

        }

        return maxLength;

    }
}
