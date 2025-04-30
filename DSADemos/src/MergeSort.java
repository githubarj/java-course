public class MergeSort {
    public static void main (String[] args) {
        int[] arr = {4, 6, 2, 1, 9, 13 , 15 , 11, 3};

        for(int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting: ");
        for (int n : arr){
            System.out.print(n + " ");
        }


    }
    public static void mergeSort(int[] arr, int low, int high ){

        if ( low <  high ) {

            int mid = (low + high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1 , high);

            merge(arr, low , mid, high);
        }

    }

    public static void merge (int[] arr, int low, int mid, int high){
        int n1 = mid - low +  1; // to get the length of the first array
        int n2 = high - mid; // to get the length of the second array

        int[] lArr = new int[n1]; // create the first and the second array with the sized got above
        int[] hArr = new int[n2];

        // loop over the array and set the value of the new array at each index
        for ( int x = 0; x < n1; x++){
            lArr[x] = arr[low + x];
        }

        for ( int x = 0; x < n2; x++ ){
            hArr[x] = arr[mid + 1 + x];
        }

        int i = 0;
        int j = 0  ;
        int k =  low;

        while ( i < n1 && j< n2) {
            if(lArr[i] <= hArr[j]){
                arr[k] = lArr[i];
                i++;
            }else {
                arr[k] = hArr[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = hArr[j];
            j++;
            k++;
        }
    }
}
