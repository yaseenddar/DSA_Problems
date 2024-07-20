// You are given a read only array of n integers from 1 to n.

// Each integer appears exactly once except A which appears twice and B which is missing.

// Return A and B.

// Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

// Note that in your output A should precede B.

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class FindRepeated {
    public static  int[] findMissing(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        int dup1=0,sum=0;
        for(int i = 0 ; i < arr.length; i++){
            if(set.contains(arr[i])){
                dup1 =arr[i];
            }
            sum+=arr[i];
            set.add(arr[i]);
        }
        // System.out.println(sum);

        sum -= dup1;
        int t = (arr.length*(arr.length - 1))/2;
        int missing = t -(sum);
        return new int[]{dup1,missing};

    }
public static void main(String[] args) {
    int arr[] = {0,1,2,2,3,4};


    arr = findMissing(arr);
    for(int i : arr){
        System.out.print(i+" ");
    }
}
    
}
