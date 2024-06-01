package P100_TopicWise;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("P100 : Arrays");
        /*
        * 1. Arrays : Continous Data Structures. random access : O(1) : a[n]
        * 2. Fixed size Arrays, Dynamic Sized Arrays. Java - always array
        * allocation in heap. D - ArrayList. 3 ways to create. al.add.
        * 3. All ArrayList Methods : al.dd(i,o)/add(o), addAll(C): C= Collection
        *  : array od objects, clear(), clone(), contains(o), forEach((n)->
        * {}); remove(i), size(), toArray(),
        * 4. Arrays. class : Arrays.asList(arr),binarySearch(arr,key); equals
        * (arr1, arr2), sort(), tooString()
        * 5. Important Problems :
        *
        * - Easy : Second Largest Element, if sorted, reverse an array, max
        * consecutive 1's(reset at 0 and check max)
        *
        * - Med : Remove Duplicates, move zeroes to end, rotate array by d
        * elts, Stock buy and sell(only add increase slopes-differences for
        * each)
        *
        * - Hard : Leaders in Array (start from last), Trapping Rainwater
        * (min of Lmax and Rmax - arr[i] from i=1 to i=n-2  => pre calculate
        * Lmax for each elt and store it in an array, and same for Rmax and
        * traverse the whole array and calculate min of Lmax and Rmax
        * -arr[i]), Maxiumum Sum SubArray : at each elt, add it to prevSum,
        * if the value is more than the value of the elt, add it to array, if
        * not, start a new array. each time check if the max till now is more
        *  or less than this max.new array. ; Maxium Sum in Circular SubArray
        *  : Calculate normal array max sum, calculate minimum sum of the
        * normal array, sub tract the minimum sum of the normal array from
        * the total sum of the normal array. to calculate the minimum sum of
        * sub array by std kadane's algo, use thye same algo just flip the
        * elements.
        *
        *
        * 6. subarray: n^2 => start with each elt and run a loop to all ends;
        *  Subsequence: 2^n => (each possiblilty of selecting or leaving);
        * permutations : n! => fixing one of n then fining later n-1,
        * 7. Circular subarray : for(i=0;i<=n-1){ for(j=1;j<=n-1){ idx= (i+j)%n
        * }  }
        *
        * 8. Alogorithms :
        * - Kadanes's Algo : Maximum sum of sub array : either include or not
        *  by adding it in prev sum and comparing its value if we need to
        * start a new array and compare the total max till now/ update it.
        *
        *
        * */
    }
}
