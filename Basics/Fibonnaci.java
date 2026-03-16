package Basics;

public class Fibonnaci {
    static void main(String[] args) {
        int first = 0;
        int second = 1;
        int n = 7;
        fibonacci(n,first,second);
        System.out.println("WITH RECURTION: ");
        fibonacci_rec(n,first,second);
    }
    static void fibonacci(int n, int first, int second){
        int index = 0;
        System.out.println(first);
        System.out.println(second);
        while (index < n-2) {
            int next = first + second;
            first = second;
            second = next;
            index++;
            System.out.println(next);
        }
    }
    static void fibonacci_rec(int n, int first, int second){
        if(n==2)
        {
            return;
        }
        int next = first + second;
        System.out.println(next);
        fibonacci_rec(n-1,second,next);
    }
}
