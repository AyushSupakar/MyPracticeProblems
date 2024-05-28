package P100_Problems;
import java.util.*;

public class p06_LCM {
    public static int GCDfun(int a,int b){
        int c;
        if(b>a){
            c= a;
            a= b;
            b= c;
        }

        if(b==0)
            return a;
        else
        return GCDfun(b, a%b);
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int LCM = (a*b)/(GCDfun(a,b));
        System.out.println("LCM is " + LCM);
    }
}
