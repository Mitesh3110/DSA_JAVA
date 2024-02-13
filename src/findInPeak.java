public class findInPeak {
    public static void main(String[] args) {
        int arr[] = {0,1,2,2,2,1};
        int target = 2;

        int ans = search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target){
        int peak =peakIndexInMountainArray(arr);
        int firstTry = binarySearch(arr,target,0,peak);

        if(firstTry != -1){
            return firstTry;
        }
        return binarySearch(arr,target,peak+1,arr.length-1);
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

    static int binarySearch(int arr[], int target,int start,int end){

        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }
                else if( target > arr[mid]){
                    start = mid +1;
                }
            }
            else{
                if(target<arr[mid]){
                    start = mid +1;
                }
                else if( target > arr[mid]){
                    end = mid-1;
                }
            }

        }
        return -1;
    }
}
