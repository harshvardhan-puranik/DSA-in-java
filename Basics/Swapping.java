package Basics;

public class Swapping {
    public static void main(String[] args)
    {
        Swap S = new Swap();
        S.swap1(10,20);
        S.swap2(10,20);
        S.swap3(10,20);
        S.swap4(10,20);
        S.swap5(10,20);
        S.swap6(10,20);
    }

}
class Swap{
    int a,b;
    public void display(int a,int b, int index)
    {
        System.out.println("Swaped" + index + " Values: "+a+" "+b);
    }
    public void swap1(int a,int b)
    {
        this.a=b;
        this.b=a;
        display(this.a,this.b,1);
    }
    public void  swap2(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
        display(a,b,2);
    }
    public void swap3(int a,int b)
    {
        a = a^b;
        b = a^b;
        a = b^a;
        display(a,b,3);
    }
    public void swap4(int a,int b)
    {
        a = b-a;
        b = b-a;
        a = b+a;
        display(a,b,4);
    }
    public void swap5(int a,int b)
    {
        a = a*b;
        b = a/b;
        a = a/b;
        display(a,b,5);
    }
    public void swap6(int a,int b)
    {
        b = a+b-(a=b);
        display(a,b,6);
    }
}
