import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayDiff {

    public static void main(String args[]) {
        int[] a = {1, 2, 2, 2, 3};
        int[] b = {2};

        System.out.println(Arrays.toString(arrayDiff(a, b)));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();

        for (int num : b) {
            set.add(num);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int num : a) {
            if (!set.contains(num)) {
                arrayList.add(num);
            }
        }

        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }

}
