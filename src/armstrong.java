import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 100; i<1000; i++){
            if(armstrong(i)){
                System.out.println(i);
            }
        }
    }

    static boolean armstrong(int n){
        int origin = n;
        int sum = 0;
        while (n>0){
        int rem = n%10;
        n = n/10;
        int cube = rem*rem*rem;
        sum += cube;
        }
        if(sum == origin){
            return true;
        }
        return false;
    }
}
