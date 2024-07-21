// Given an array arr containing n integers and an integer k. 
// Your task is to find the length of the longest Sub-Array 
// with the sum of the elements equal to the given value k.
import java.util.*;
class LongestSubArrayWithSum{

public static int findLength(int arr[],int k){
	int len = 0;
	HashMap<Integer,Integer> map = new HashMap<>();
	int sum = 0;
	for(int i = 0 ; i < arr.length ; i++){
		sum += arr[i];

		if(sum == k){
			len = Math.max(len,i+1);
		}

		// if sum is not equal to K then we cal the diff 
		// bet the curr sum and K this confirms the values 
		// which is less than k to be K then we check is there any previous sub array that has sum the diff
		// if yes then that means if we remove that subarray sum from the curr total sum of elements we get the K 
		//  then we check what was the last index of the subarray for sum == diff we then calcualte the length of the curr sum array

		int rem = sum - k;

		if(map.containsKey(rem)){
			int lastInx = map.get(rem);
			len = Math.max(len,i - lastInx );
		}else{
			map.put(sum,i);
		}
	}
	return len;
}

	public static void main(String[] args) {
		int arr[] = {10,5,2,7,1,9};

		System.out.println(findLength(arr,10));
	}
}