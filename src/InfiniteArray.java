public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = {3,5,7,9,10,15,19,20,24,29,30,36,39,50,67,69,89,100};
        int target = 25;
        System.out.println(ans(arr,target));
    }

    static  int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end-start +1)*2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int arr[], int target, int start, int end){

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }
            else if( target > arr[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
