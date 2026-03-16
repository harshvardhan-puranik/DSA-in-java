public class array2dsearch {
    public static void main(String[] args) {
        int[][] array = {
                {1,2,3},
                {5,6,7},
                {9,10,11},
                {12,13,14,15}
        };
        int target = 11;
        search(array,target);
    }
    static void search(int[][] arr, int target){
        int start = 0;
        int rows = arr.length;
        int cols = arr[0].length;
        int end = rows * cols - 1;


        while(start<=end){
            int mid = (start+(end-start)/2);
            int r = mid / cols;
            int c = mid % cols;
            if(arr[r][c]==target){
                System.out.println(r+" "+c);
                return;
            }
            else if(arr[r][c]>target){
                end=mid-1;
            }
            else {
                start = mid + 1;
            }
        }
        System.out.println("not found");
        return;
    }
}
