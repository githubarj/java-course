// Given an integer raay nums and an integer k , return the k most frequent elements. You may return the answer in any given order


import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

//    public static int[] frequentElements(int[] nums, int k) {
//        Map<Integer, Integer> ansMap = new HashMap<>();
//        for (int num : nums) {
//            ansMap.putIfAbsent(num, 0);
//            ansMap.put(num, ansMap.get(num) + 1);
//        }
//        // sort the map entries by values in descending order
//        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(ansMap.entrySet());
//
//        // compare and sort in descending order
//        sortedEntries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
//
//        // getting the k most frequent elements
//        List<Map.Entry<Integer, Integer>> topK = sortedEntries.subList(0, Math.min(k, sortedEntries.size()));
//
//        int[] result = new int[topK.size()];
//        for (int i = 0; i < topK.size(); i++) {
//            result[i] = topK.get(i).getKey();
//        }
//        return result;
//    }

    public static int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) {
            return nums;
        }

        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
                (a, b) -> count.get(a) - count.get(b)
        );

        for (int n : count.keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] ans = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            ans[i] = heap.poll();
        }

        return ans;
    }
}
