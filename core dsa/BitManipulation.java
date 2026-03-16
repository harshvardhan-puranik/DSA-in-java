public class BitManipulation {
    //Bit Mask - 1<<i (i is position)
    //Get Bit - AND with number
    //Set Bit - OR with number
    //Clear Bit - NOT with number + AND with number
    //Update Bit - Clear / Set
    // Bit Mask + Operation

    static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;
        Get(n,bitmask);
        Set(n,bitmask);
        Clear(n,bitmask);
        Update(n,bitmask);


    }
    static void Get(int n,int bitmask){
        System.out.println("Get Bit: ");
        if((bitmask&n)==0){
            System.out.println("The bit at position is 0");
        }
        else{
            System.out.println("The bit at position is 1");
        }
    }
    static void Set(int n,int bitmask){
        System.out.println("Set Bit: ");
        int newnum = bitmask|n;
            System.out.println(newnum);

    }
    static void Clear(int n,int bitmask){
        System.out.println("Clear Bit: ");
        int newnum = ~bitmask&n;
            System.out.println(newnum);
    }
    static void Update(int n,int bitmask){
        System.out.println("Update Bit: ");
        int oper = 1;
        if (oper == 1) {
            //clear bit
            int newnum = ~bitmask&n;
            System.out.println(newnum);
        }
        else{
            //set bit
            int newnum = bitmask|n;
            System.out.println(newnum);
        }
    }
}
