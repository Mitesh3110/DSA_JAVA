import java.util.Scanner;

public class Occurence_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the large number for occurence count");
        long a = sc.nextLong();
        System.out.println("Enter the numbr for which you look:");
        int b = sc.nextInt();
        int count = 0;
        while(a>0){
            if(a%10 == b){
                count ++;
            }
            a = a/10;
        }
        System.out.println(count);
    }

}
