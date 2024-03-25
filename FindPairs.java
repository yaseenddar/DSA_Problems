// Problem Statement
// Given an array of integers and a value k,
// return number of pairs whose difference is equal to the k;
import java.util.*;
class FindPairs{
	public static int findCountofPairs(List<Integer>arr,int k){
 
    int count =0;
   HashSet<Integer> hs = new HashSet<>(arr);
   for(int i :arr){
       if(hs.contains(i - k)){// if the difference of num - k is already in arraylist or not
           count++;
       }
   }
   return count;
    }
    

	public static void main(String[] args) {
		List<Integer> lsit = new ArrayList<>();
		lsit.add(2);
		lsit.add(4);
		lsit.add(10);
		lsit.add(3);		
		lsit.add(6);
		lsit.add(70);

		System.out.println(findCountofPairs(lsit,2));
	}
}
