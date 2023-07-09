package com.company;
import java.util.Scanner;
public class p03_factorial {
    public static int factrecfun (int n){
        if(n==0)
            return 1;
        else
        return n*factrecfun(n-1);
    }

    public static void main(String [] args){
        System.out.println("Enter the number");
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = a;
        int facti=1;
        int factr=1;

        System.out.println("ITERATIVE SOLUTION");
        while(a>0){
            facti=facti*a;
            a = a-1;
        }
        System.out.println(facti);

        System.out.println("RECURSIVE SOLUTION");

        factr = factrecfun(b);
        System.out.println(factr);
    }
}
