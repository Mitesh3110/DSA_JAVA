import java.util.Scanner;

public class String_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        if(fruit.equalsIgnoreCase("Mangoes")){
            System.out.println("It is King of fruit in 1");
        }
        if(fruit == "Mangoes"){
            System.out.println("It is King of fruit in 2");
        }
    }
}
