import java.util.Arrays;
import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        String name = "malayalam";
        boolean[] map = new boolean[26];
        for(int i = 0; i < 26; i++) {
            map[i] = false;
        }
        int[] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of N and X: ");
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println("Sum of n natural nums: "+sum(n));
        System.out.println("Factorial of a number: "+factorial(n));
        System.out.println("Power of a number "+x+" power "+n+" : "+power(x,n));
        System.out.println("Array: "+Arrays.toString(arr));
        strrev(name,name.length()-1);
        System.out.println();
        checksort(arr,0,false);
        Removedupli(name,map,0,"");

    }
    static int sum(int n){
        if(n==0)
            return 0;

        return sum(n-1)+n;
    }
    static int factorial(int n){
        if(n==1)
            return 1;
        return n*factorial(n-1);
    }
    static int power(int n,int m){
        if(m==0)
            return 1;
        if(n==0)
            return 0;
        return n*power(n,m-1);
    }
    static void strrev(String name, int i)
    {
        if(i<0)
            return;
        System.out.print(name.charAt(i));
        strrev(name,i-1);

    }
    static void checksort(int[] arr, int i, boolean issorted)
    {
        if(i==arr.length-1) {
            System.out.println("Array is sorted");
            return;
        }
        if(arr[i]<arr[i+1])
        {
            issorted=true;
        }
        else {
            issorted = false;
            System.out.println("Array is not sorted");
            return;
        }
        checksort(arr,i+1,issorted);

    }
    static void Removedupli(String original, boolean[] map, int index, String newString)
    {
        if(index==original.length())
        {
            System.out.println(newString);
            return;
        }
        int pos = original.charAt(index)-'a';
        if(!map[pos]) {
            newString += original.charAt(index);
            map[pos] = true;
        }
        Removedupli(original,map,index+1, newString);
    }
}
