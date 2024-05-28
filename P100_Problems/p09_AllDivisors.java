package P100_Problems;
import java.util.*;
public class p09_AllDivisors {
    public static void main(String[] args) {
        int a;
        Scanner x = new Scanner(System.in);
        a = x.nextInt();
        int i,c=0;

        for(i = 1; i*i<=a; i++){
            if(a%i==0){
                System.out.print(" "+i);
            }
            c=i;
        }

        for( i = c-1 ;i*i>=1; i--){
            if(a%i==0){
                System.out.print(" "+a/i);
            }
        }

    }
    }
