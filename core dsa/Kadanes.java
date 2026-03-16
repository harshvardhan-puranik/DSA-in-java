public class Kadanes {
    static void main(String[] args) {
    int[] arr = {-1,-5,-6,-7,-4};
    kadanes(arr);
    }
    public static void kadanes(int[] arr){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int j=0;j<arr.length;j++){

            currsum+=arr[j];
            if(currsum>maxsum){
                maxsum=currsum;
            }
            if(currsum<0){
                currsum=0;
            }
        }
        System.out.println(maxsum);
    }

}
