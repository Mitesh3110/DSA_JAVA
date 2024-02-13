import java.util.*;
import java.math.*;

public class MAx_OF_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();

        System.out.println("Maximum number is: "+ Math.max(c,Math.max(a,b)));

    }
}
