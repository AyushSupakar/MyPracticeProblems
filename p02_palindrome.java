package com.company;
import java.util.Scanner;
public class p02_palindrome {
    public static void main(String[]args){
        long a;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number you want to check if its palindrome or not");
        a= x.nextLong();
        long b = a;
        long p=0;
        boolean answer=false;

        while(a>0L){
            p = p*10L + a%10L;
            a= a/10;

        }

        if(b==p){
            answer= true;
        }
        else if(b!=p){
            answer = false;
        }


        System.out.println(answer);



    }
}
