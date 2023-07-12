package com.company;
import java.util.*;
public class p12_power_iterative {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int n = x.nextInt();
        int i;
        int res= 1;
        while(n>0){
            if(n%2!=0){
                res = res*a;
            }
            a = a*a;
            n=n/2;
        }

        System.out.println(res);
    }
}
