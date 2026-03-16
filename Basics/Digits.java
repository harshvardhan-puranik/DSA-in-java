package Basics;

public class Digits {
    static void main(String[] args) {
        int Num = 3434849;
        digits(Num);
        evenorodd(Num);
        Sum(Num);
    }
    static void digits(int Num)
    {
        //number of digits
        int count = 0;
        while(Num > 0){
            Num = Num / 10;
            count++;
        }
        System.out.println(count);
    }
    static void evenorodd(int Num)
    {
        int rem = 0;
        int even=0;
        int odd=0;


        //even or odd digits
        while(Num > 0){
            rem = Num % 10;
            if(rem%2==0){
                even++;
            }
            else{
                odd++;
            }
            Num = Num / 10;
        }
        System.out.println(even+" "+odd);
    }
    static void Sum(int Num)
    {
        int sum = 0;
        while(Num > 0){
            sum = sum + Num % 10;
            Num = Num / 10;
        }
        System.out.println(sum);
    }
}
