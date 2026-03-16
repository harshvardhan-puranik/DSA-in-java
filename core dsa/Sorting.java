import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {3,7,4,1,9,8};
        int[] output1 = bubble(arr);
        int[] output2 = selection(arr);
        int[] output3 = insertion(arr);
        HashSet<String> set = new HashSet<>();
        String name = "aabc";
        System.out.println("O(n2) Sorting Algorithms: ");
        System.out.println("Bubble Sort: "+Arrays.toString(output1));
        System.out.println("Selection Sort: "+Arrays.toString(output2));
        System.out.println("Insertion Sort: "+Arrays.toString(output3));
        System.out.println("Substrings: ");
        substrings(name,0,"");
        UniqueSubstrings(name,0,"", set);
    }
    static int[] bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
//                    swap(arr[j],arr[j+1]); // Java creates the copy of primitive data types hence pass array to function or pass objects
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        return arr;
    }
    static int[] selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
    static int[] insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                    arr[j+1] = arr[j];
                    j--;
            }
            arr[j+1] = current;
        }
        return arr;
    }
    static void merge(int[] arr,int start, int end)
    {
        if(start >= end)
        {
            return;
        }

        int mid = start + (end - start)/2;
        merge(arr,start,mid);
        merge(arr,mid+1,end);



    }
    static void substrings(String mainstring, int index, String substring)
    {
        if(index == mainstring.length()) {
            System.out.println(substring);
            return;
        }
        char current = mainstring.charAt(index);
        substrings(mainstring,index+1,substring+current);
        substrings(mainstring,index+1,substring);
    }
    static void UniqueSubstrings(String mainstring, int index, String substring, HashSet<String> set)
    {
        if(index == mainstring.length()) {
            if(set.contains(substring)) {
                return;
            }
            else {
                System.out.println(substring);
                set.add(substring);
                return;
            }
        }
        char currchar =  mainstring.charAt(index);
        UniqueSubstrings(mainstring,index+1,substring+currchar,set);
        UniqueSubstrings(mainstring,index+1,substring,set);
    }
}
