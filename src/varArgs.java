import java.util.Arrays;
import java.util.Scanner;

public class varArgs {
    public static void main(String[] args) {
        func(1,5,45,6,4546,78,324);
        func2("Mitesh","Harsh", "vishva");
        func3(2,5,"Mitesh","Makvana");
    }
    static void  func(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void  func2(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void  func3(int a, int b, String ...v){
        System.out.println(a + " " +b + " " + Arrays.toString(v));
    }
    static void  sum(int a, int b){
        System.out.println(a+b);
    }
}
