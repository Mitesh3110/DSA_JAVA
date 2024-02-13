public class Mountain {
    public static void main(String[] args) {
        int arr[] = {0,1,2,2,2,1};
        int target = 2;

        int peakIndex = peakIndexInMountainArray(arr);
        int ans = targetIndex(arr,peakIndex,target);
        System.out.println(ans);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while (start < end) {
            int mid = start + (end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start = mid +1;
            }
        }
        return start;
    }

    public static int targetIndex(int[] arr, int index,int target){
        int start = 0;
        int end = index;

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
