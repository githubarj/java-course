public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 2, 4 , 6, 7 ,8 , 10, 12, 15 , 19, 50, 89 , 90, 91, 94};
        int target = 9098;

       int result =  binarySearch(nums, target);
       int result2 = linearSearch(nums, target);
       int result3 = binaryRecursiveSearch(nums, target, 0, nums.length -1);

       System.out.println("Index of the target value: " + result);
       System.out.println("Index of the target value: " + result2);
       System.out.println("\nRecursive Search result: " + result3);

    }

    public static int binarySearch (int[] array, int target){
        int start = 0;
        int end = array.length - 1;
        int steps = 0;
      while (start <= end) {
          int mid = (start + end)/2; // here if the answer is a fraction it is type-casted into an integer by truncating the last part
          steps ++;
          if ( array[mid] == target){
              System.out.println("Number of steps taken by binarySearch: " + steps);
              return mid;
          }else if (array[mid] < target) {
              start = mid + 1;
          }else {
              end = mid - 1;
          }
      }
        System.out.println("Number of steps taken by binarySearch: " + steps);
        return -1;
    }

    public static int linearSearch (int[] array, int target){
        int steps = 0; // find out how many steps taken
        for (int i = 0; i < array.length ; i ++) {
            steps ++;
            if (array[i] == target) {
                System.out.println("Number of steps taken linearSearch: " + steps);
                return i;
            }
        }
        System.out.println("Number of steps taken linearSearch: " + steps);
        return -1;
    }

    // Recursive functions Search technique
    public static int binaryRecursiveSearch (int[] nums, int target, int start, int end){
        int mid = (start + end)/2;
        if (start <= end ) {
            if (nums[mid] == target){
                return mid;
            }else if(nums[mid] > target) {
                return binaryRecursiveSearch(nums, target, start, mid - 1);
            }else {
                return binaryRecursiveSearch(nums, target, mid + 1 , end);
            }
        }
        return -1;
    }

}

