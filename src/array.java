import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[][] ary = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<ary.length; i++){
            for (int j = 0; j<ary[i].length; j++){
                ary[i][j] = sc.nextInt();
            }
        }

//        for (int i = 0; i<ary.length; i++){
//            for (int j = 0; j<ary[i].length; j++){
//                System.out.print(ary[i][j] + " ");
//            }
//            System.out.println();
//        }
        //shorthand
        for (int i = 0; i<ary.length; i++){
            System.out.println(Arrays.toString(ary[i]));
        }

//        enhancedd for
        for(int[] a: ary){
            System.out.println(Arrays.toString(a));
        }
    }
}
