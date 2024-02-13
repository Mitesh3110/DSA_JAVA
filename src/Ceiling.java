import java.util.Scanner;

public class Ceiling {

    public static void main(String[] args) {
        int arr[] = {-12,-2, 0, 5, 10, 14, 19, 27, 52, 59, 76, 100};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Key to find: ");
        int key = sc.nextInt();
        int index = ceilingNum(arr,key);
        System.out.println("Target found at index: " + index );
    }

    static int ceilingNum(int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        if(target>arr[end]){
            return -1;
        }

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
        return start;
    }
}
