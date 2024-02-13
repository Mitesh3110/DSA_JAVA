/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class Lucknumber_Codechef
{
    static int p  = 0;
    public static void fun(long num){
        if(num%2 == 0){
            p = p+1;
            num = num/2;
            if(num%2==0){
                fun(num);
            }
            else{
                if(p%2 == 0){
                    System.out.println(1);
                    return;
                }
                else{
                    System.out.println(0);
                    return;
                }
            }

        }
        else if(p%2 == 1){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }

    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            long num = sc.nextLong();
            if (num%2 == 1) {
                System.out.println(1);

            }
            else{
                fun(num);
            }
            t--;
        }

    }
}
