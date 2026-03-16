import java.util.Arrays;

import static java.util.Collections.sort;

public class problems {
    static void main(String[] args) {
        int[] arr = {11,2,90,4,5,8};
        int[] arrsorted = {2,4,5,8,11,90};
        System.out.println("Original Array: "+Arrays.toString(arr));
        System.out.println("Max of Array: "+max(arr));
        System.out.println("Reversed Array: "+Arrays.toString(reverse(arr)));
        System.out.println("Linear Search: "+LinearSearch(arr,90));
        System.out.println("Sorted Array: "+Arrays.toString(arrsorted));
        System.out.println("Binary search: "+BinarySearch(arrsorted,90));
    }
    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    return max;
    }
    static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
    static int LinearSearch(int[] arr,int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    static int BinarySearch(int[] arrsorted, int key){
        int low = 0;
        int high = arrsorted.length-1;
        while (low <= high) {
            int mid = low+(high-low)/2;
            if(arrsorted[mid] == key){
                return mid;
            }
            else if(arrsorted[mid] < key){
                low = mid+1;
            }
            else if(arrsorted[mid] > key){
                high = mid-1;
            }
        }
        return -1;

        // worst case : log (BASE 2) N
    }
}
// Use Math.log10(num)+1 to get number of digits in any number
