public class ceilingofanumber {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,45,69,71};
        int target = 69;
        int ceiling = bs(arr,target);
        System.out.println(ceiling);
    }
    static int bs(int[] arr,int target){
        int high=arr.length-1;
        int low=0;
//        int ceil_value=-1;
        while(low<=high){
            int mid=(low+high)/2;
//            if(low==high){
//                if(arr[mid]>target){
//                    return arr[mid];
//                }
//                else if(arr[mid]<target){
//                    if(mid!=arr.length-1) {
//                        if (arr[mid + 1] > target) {
//                            return arr[mid + 1];
//                        }
//                    }
//                }
//            }
            if(arr[mid]==target) {
                return target;
            }
            if(arr[mid]>target){
//                ceil_value=arr[mid];
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }

        }
        return arr[low];
    }
}
