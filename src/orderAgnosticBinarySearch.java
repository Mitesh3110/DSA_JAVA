import java.util.Scanner;

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int arr[] = {121,45,33,31,23,21,19,15,11,6,1,-12,-24,-45,-99};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Key to find: ");
        int key = sc.nextInt();
        int index = binarySearch(arr,key);
        System.out.println("Target found at index: " + index );
    }

    static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
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
