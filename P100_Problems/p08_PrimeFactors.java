package P100_Problems;
import java.util.Scanner;

public class p08_PrimeFactors {
    public static void main(String[] args) {
        int a;
        Scanner x = new Scanner(System.in);
        a = x.nextInt();
        if(a<=1){
            System.out.println("Invalid Input");
        }
        System.out.println(" ");
        while(a%2 == 0){
            System.out.print(2+ " ");
            a=a/2;

        }
        while(a%3==0){
            System.out.print(3+ " ");
            a=a/3;
        }
        for(int i =5; i*i<=a; i+=6){
            while (a%i==0){
                System.out.print(i+ " ");
                a=a/i;

            }
            while(a%(i+2)==0){
                System.out.print((i+2) + " ");
                a = a/(i+2);
            }
        }
        if(a!=1) {
            System.out.print(a);
        }
    }
}
