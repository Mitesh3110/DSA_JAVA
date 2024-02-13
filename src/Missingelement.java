import java.util.ArrayList;
import java.util.Arrays;

public class Missingelement {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,7,8};
        System.out.println(Arrays.toString(array));
        int index = -1;
        ArrayList<Integer> list = new ArrayList<>(10);
        for(int element: array){
            list.add(element);
        }
        for(int i = 0; i< array.length ; i++){
            if (array[i] != i+1){
                index = i;
                break;
            }
        }

        if(index>=0){
            list.add(index,(index+1));
        }
        System.out.println(list);
    }
}
