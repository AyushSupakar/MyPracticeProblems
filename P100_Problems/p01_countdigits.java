package P100_Problems;
import java.util.Scanner;
public class p01_countdigits {
    public static void main (String []args ){
        long a;
        System.out.println("Enter the number of which you want to find the number of digits");
        Scanner x = new Scanner(System.in);
        a = x.nextLong();
        int ans=0;
        while(a>0L){
            a = a/10L;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ;
            ans= ans+1;
        }
        System.out.println("Your answer is "+ans);
    }
}
