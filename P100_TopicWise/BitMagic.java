package P100_TopicWise;



public class BitMagic {

    // 1. You are given a number N. Find the total count of set bits for all
    // numbers from 1 to N(both inclusive).

    public static int countSetBits(int n)
    {
        // visualise it as pattern of repeating 1's and 0's when u look at
        // only lsb or the bits next to it and like that for every single number

        n+=1; // because we gotta include 0
        int tot=0;
        int tp = 2; // first pattern in of length 2;
        int ext;
        while((n>=(tp/2))){ // n>=tp/2 because we need the msb bits which
            // contribute to the extra tp bit 1.
            tot = tot + (n/tp)*(tp/2); // bits in complete pattern
            ext = Math.max(((n % tp) - (tp / 2)), 0); // bits extra
            tot = tot +ext;
            tp*=2; // update with tp*2

        }
        return tot;

    }


    public static void main(String[] args) {
        System.out.println("BitMagic");
    }
}
