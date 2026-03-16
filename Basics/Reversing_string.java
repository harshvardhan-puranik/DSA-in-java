package Basics;

public class Reversing_string {
    static void main(String[] args) {
        String str = "ABCD";
        String revstr = "";
        int len = str.length();
        for (int j = len - 1; j >= 0; j--) {
            revstr = revstr + str.charAt(j);
        }
        System.out.println(revstr);
        //str.toCharArray()
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        System.out.println(sb);


        StringBuffer sb1 = new StringBuffer();
        sb1.append(str);
        StringBuffer rev = sb1.reverse();
        System.out.println(rev);
    }
}
