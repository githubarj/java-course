// Given an integer raay nums and an integer k , return the k most frequent elements. You may return the answer in any given order


import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 1;
        System.out.println(Arrays.toString(frequentElements(nums, k)));
    }

    public static int[] frequentElements(int[] nums, int k) {
        Map<Integer, Integer> ansMap = new HashMap<>();
        for (int num : nums) {
            ansMap.putIfAbsent(num, 0);
            ansMap.put(num, ansMap.get(num) + 1);
        }
        // sort the map entries by values in descending order
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(ansMap.entrySet());

        // compare and sort in descending order
        sortedEntries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // getting the k most frequent elements
        List<Map.Entry<Integer, Integer>> topK = sortedEntries.subList(0, Math.min(k, sortedEntries.size()));

        int[] result = new int[topK.size()];
        for (int i = 0; i < topK.size(); i++) {
            result[i] = topK.get(i).getKey();
        }
        return result;
    }
}
