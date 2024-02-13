//public class swap {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        System.out.println(" before swaping A = " + a + " B = "+b);
//        swap(a,b);
//        System.out.println(" after swaping A = " +a + " B = " +b);
//    }
//    static void swap(int a, int b){
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(" after swaping in function A = " +a + " B = " +b);
//    }
//}


import java.util.Arrays;

//new Way
public class swap {
    public static void main(String[] args) {
        int[] array = {1,2,5,8,9};
        System.out.println(Arrays.toString(array));
//        swap(array, 0 ,4);
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));

    }
    static void swap(int array[],int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    static void reverse(int [] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            swap(arr,start,end);
            start ++;
            end --;
        }
    }
}

