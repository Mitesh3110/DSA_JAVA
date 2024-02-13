package MAtrix;

import java.util.Arrays;

public class RowColumnSearch {
    public static void main(String[] args) {

        int[][] matrix = {
                {10,20,30,40},
                {15,21,32,42},
                {17,23,33,45},
                {20,27,37,49}
        };
        System.out.println(Arrays.toString(search(matrix,22)));

    }

    static int[] search(int[][] arr,int target){
        int r=0;
        int c = arr.length-1;

        while(r < arr.length && c >=0){
            if(arr[r][c] == target){
                return new int[]{r,c};
            }
            if(arr[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}


