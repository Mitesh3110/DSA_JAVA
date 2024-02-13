import java.util.Scanner;

public class checkvowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int flag =1;
        for (int i =0; i<arr.length; i++){
            if(arr[i] == 'a' | arr[i] == 'e' | arr[i] == 'i' | arr[i] == 'o' | arr[i] == 'u'){
                System.out.println("String has a (" + arr[i] + ") available ");
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("No vowel");
        }
    }
}
