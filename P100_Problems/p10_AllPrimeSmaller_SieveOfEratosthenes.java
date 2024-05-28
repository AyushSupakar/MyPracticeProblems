package P100_Problems;
import java.util.*;
public class p10_AllPrimeSmaller_SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int p = x.nextInt();
        boolean[] arr = new boolean[p+1];
        for(int i=0; i<p;i++){
            arr[i]=true;
        }
        for(int i=2;i<=p*p;i++){
            for(int j=i*i;j<=p;j=j+i){
                arr[j]=false;
            }
        }
        for(int i=2;i<=p;i++){
            if(arr[i]==true)
            System.out.print(" "+ i);
        }


    }
}
