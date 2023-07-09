package com.company;
import java.util.*;
public class p05_GCDorHCF {
    public static int GCDfun(int a, int b){
        if(b==0)
            return a;
        else
        return GCDfun(b,a%b);
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a,b;
        a = x.nextInt();
        b = x.nextInt();
        int ans;
        if (a==b){
            System.out.println("HCF is "+a);
        }
        else {
            if(a>b)
           ans = GCDfun(a,b);
            else
                ans = GCDfun(b,a);

            System.out.println("HCF is "+ans);
        }
    }
}
