package Basics;

public class Prime {
    static void main(String[] args) {
        int num = 2;

        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                System.out.println("Not Prime number");
                return;
            }
        }
            System.out.println("Prime number");
    }

}
