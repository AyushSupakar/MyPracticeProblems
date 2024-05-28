package P100_Problems;
import java.util.*;
public class p04_trailingzerosinfactorial {
    public static void main(String[] args) {
        int a;
        Scanner x = new Scanner (System.in);
        a = x.nextInt();
        int i=5;
        int sol=0;
        while(i<=a){
            sol = sol + a/i;
            i=i*5;
        }
        System.out.println(sol);


    }
}
