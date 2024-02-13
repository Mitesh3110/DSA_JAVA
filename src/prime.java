import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int a){
        if(a <= 1){
            return false;
        }
        int c = 2;
        while(c*c <= a){
            if(a%c == 0){
                return false;
            }
            c++;
        }
        return  c*c > a;
    }
}
