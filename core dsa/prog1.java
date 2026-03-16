import java.util.*;
class prog1{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        int[] stud = new int[5];
        stud = new int[]{10,20,30};
        int[] std = {1,2,3,4};
        System.out.println(Arrays.toString(stud));

        ArrayList<Integer> aname = new ArrayList<>(5);
        aname.add(10);
        aname.add(20);
        aname.add(30);
        aname.add(40);
        aname.set(0,99);
        aname.remove(3);
        System.out.println(aname.get(2));
        System.out.println(aname);
    }
}