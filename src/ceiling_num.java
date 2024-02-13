import java.util.Scanner;

public class ceiling_num {

    public static void main(String[] args) {
        int[] arr = {1,2,4,8,25,34,66,89,101};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find ceiling number: ");

        int key = sc.nextInt();
        int left = 0;
        int right = arr.length -1;
        int m = ceiling(arr,left,right,key);
        if(m<=right){
            System.out.println("Number is at index " + m + " having value >= " + key + " is " + arr[m]);
        }

        }

        static int ceiling(int arr[],int left, int right,int key){
        if (key> arr[right]){
            String str = error();
            System.out.println(str);
            return right+1;
        }
        int mid =0;
        while(left <= right){
            if(left == right){
                if(arr[left]>key){
                    return left;
                }
                else{
                    return left+1;
                }
            }
            mid = left + (right-left)/2;
            if(arr[mid]<key) {
                left = mid +1;
            }
            else if(arr[mid]>key){
                right = mid-1;
            }
            else{
                break;
            }
        }
        return mid;
        }

        static String error(){
        String str = "Value can not found in array as it is higher than maximum value";
        return  str;
        }
    }

