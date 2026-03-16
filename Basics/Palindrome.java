package Basics;

public class Palindrome {
    static void main(String[] args) {
        String str = "malayalam";
        int num = 12321;
        palinum(num);
        palistr(str);
        recpali(str,str.length()-1,"");
    }
    static void palinum(int num){
        int rev = 0;
        int rem = 0;
        int orig = num;
        while(num>0){
            rem = num%10;
            num=num/10;
            rev = rev*10 + rem;
        }
        if(orig==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    static void palistr(String str){
        String revstr = "";
        int len = str.length();
        for (int j = len - 1; j >= 0; j--) {
            revstr = revstr + str.charAt(j);
        }
        if(revstr.equals(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    static void recpali(String str, int index, String revstr){
        if(index==-1){
            if(revstr.equals(str)){
                System.out.println("Palindrome");
                return;
            }
            else{
                System.out.println("Not Palindrome");
                return;
            }

        }
        revstr = revstr + str.charAt(index);
        recpali(str,index-1,revstr);

    }
}
