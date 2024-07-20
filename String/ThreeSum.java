// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.
 import java.util.*;
public class ThreeSum{
public static void threeSum(int arr[]){
	Set<List<Integer>> list = new HashSet<>();
	for(int i = 0 ; i < arr.length ; i++){
		int temp = arr[i];

		int left = i+1;  
		int right = arr.length-1;
		while(left < right){
			int sum = temp + arr[left] + arr[right];
			if(sum == 0){
				System.out.print("["+temp+","+arr[left]+","+arr[right]+"]");
			}
			if(sum > 0){
				right--;
			}
			if(sum < 0){
				left++;
			}
		}

	}
}
	public static void main(String[] args) {
		// System.out.print(threeSum(new int[]{-1,0,1,2,-1,-4}).toString());
		threeSum(new int[]{-1,0,1,2,-1,-4});
		// System.out.print(list.toString());
	}
}