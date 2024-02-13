import java.util.Scanner;

public class Sitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit) {
            case "Apple" -> System.out.println("Red colour");
            case "Jamun" -> System.out.println("Purple colour");
            case "Mango" -> System.out.println("Yellow-green colour");
            default -> System.out.println("Enter Valid value");
        }
    }
}
