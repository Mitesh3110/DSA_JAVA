import java.util.Scanner;

public class rev_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int revnum = 0;

        while(num>0){
            int c = num%10;
            revnum= revnum*10 + c;
            num = num/10;
        }
        System.out.println(revnum);
    }
}
