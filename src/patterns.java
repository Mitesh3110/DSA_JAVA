//public class patterns {
//    public static void main(String[] args) {
//         pattern1(5);
//         pattern2(5);
//         pattern3(5);
//         pattern4(5);
//         pattern5(5);
//         pattern6(5);
//         pattern7(4);
//         pattern8(4);
//         pattern9(4);
//    }
//    static void pattern1(int n){
//        for (int i = 1; i<=n; i++){
//            for(int j=1;j<=n;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern2(int n){
//        for (int i =1; i<=n;i++){
//            for (int j =1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//
//    static void pattern3(int n){
//        for (int i = 1; i<=n; i++){
//            for(int j=n-i+1; j>=1; j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//
//    static void pattern4(int n){
//        for (int i =1; i<=n;i++){
//            for (int j =1;j<=i;j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    static void pattern5(int n){
//        for (int row =1; row<= (2*n -1);row++){
//            int col = row > n ? 2*n - row : row;
//            for (int j =1;j<=col;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//
//    static void pattern6(int n){
//        for (int row=1;row <=n;row++){
//            for(int space=1;space<=(n-row);space++){
//                System.out.print(" ");
//            }
//            for(int col = 1; col<=row; col ++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//
//    static void pattern7(int n){
//        int terms = n*(n+1)/2;
//        for (int row = n; row>=1; row--){
//            for(int col=1;col<=row;col++){
//                System.out.print(terms-row+col + " ");
//            }
//            terms = terms-row;
//            System.out.println();
//        }
//    }
//
//    static void pattern8(int n){
//        int k =1;
//        for (int i =1; i<=n; i++){
//            for (int j =1; j<=i; j++){
//                System.out.print(k + " ");
//                k++;
//            }
//            System.out.println();
//        }
//    }
//
//    static void pattern9(int n){
//        int p = 1;
//        for( int i = 1; i<=n; i++){
//            for(int j =1; j<=n-i;j++){
//                System.out.print("* ");
//            }
//            for(int k =1;k<=i;k++){
//                System.out.print(p + " ");
//                p++;
//            }
//            System.out.println();
//        }
//
//    }
//}
