package P100_TopicWise;

public class Mathematics {

    //1. Given two integers ‘a’ and ‘m’. The task is to find the smallest modular multiplicative inverse of ‘a’ under
    // modulo ‘m’. if it does not exist then return -1.

    public static int modInverse(int a, int m)
    {

        for (int x = 0; x < (m-1); x++) {
            if(((a*x)%m)==1){
                return x;
            }

        }
        return -1;

    }



    public static void main(String[] args) {
        System.out.println("Hi Maa");
    }
}
