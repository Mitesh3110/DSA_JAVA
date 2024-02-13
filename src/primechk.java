public class primechk {
    public static void main(String[] args) {
        int n = 31;
        int flag = 1;
        for(int i = 2; i<=n/2 ; i++){
            if(n%i == 0){
                System.out.println("num is not prime");
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Number is prime");
        }

    }
}
