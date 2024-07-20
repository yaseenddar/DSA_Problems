/**
 * FindPairs
 * find count of Pairs in the list that has the difference k
 */
import java.util.*;
public class FindPairs {
public static int FindPairCount(ArrayList<Integer>arr,int k){
	HashSet<Integer> set = new HashSet<>(arr);//addign all list values to set and uniquely 
	// its easy to find inthe set by const time complexity
	int count=0;
	for(int i : arr){
		if(set.contains(i-k)){//if difference is present in the list then i - k 
			// that means we find the elem that on subtracting will give k i - elem = k
			count++;
		}
	}
	return count;


}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(9);
		list.add(3);
		list.add(4);
		list.add(7);
		list.add(8);
		System.out.println(FindPairCount(list,1));
	}
}