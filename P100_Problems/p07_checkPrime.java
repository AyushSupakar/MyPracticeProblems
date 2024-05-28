package P100_Problems;
import java.util.*;

public class p07_checkPrime {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int ans = 0 ;
        if(a==0 || a==1){
            System.out.println("NOT Prime");
        }
        else if(a==2 || a==3){
            System.out.println("It is Prime");
        }
        else if(a%2==0 || a%3==0){
            System.out.println("NOT Prime");
        }
        else {
            ans = 2;
            for (int i = 5; i*i<=a; i = i+6){
                if(a%i==0 || a%(i+2)==0){
                    ans = 1;
                    break;
                }
            }
            if (ans == 2){
                System.out.println("It is Prime");
            }
        }

    }
}
