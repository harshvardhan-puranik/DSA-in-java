package Basics;

public class Reversing_num {
    public static void main() {
        int num = 4321;
        int reverse = rev1(num,0);
        System.out.println(reverse);
        rev2(num);
        rev3(num);
    }
    static int rev1(int num, int rev) {
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num/10;

        }
        return rev;
    }
    static void rev2(int num) {
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        System.out.println(rev);
    }
    static void rev3(int num) {
        StringBuilder rev = new StringBuilder();
        rev.append(num);
        rev.reverse();
        System.out.println(rev);
    }
}
