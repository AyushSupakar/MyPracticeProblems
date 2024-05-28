package P100_Problems;
import java.util.*;

public class p11_Power_Recursion {
    public static int power(int a, int n){
        if(n==0)
            return 1;

        int temp = power(a, n/2);
        temp = temp*temp;

        if(n%2!=0){
        temp= temp*a;
        }

        return temp;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int n =x.nextInt();
        System.out.println("The result is "+power(a,n));

    }
}
