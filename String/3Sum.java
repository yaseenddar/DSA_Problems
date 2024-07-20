// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.
 import java.util.*;
public class ThreeSum{
public static List<ArrayList> threeSum(int arr[]){
	List<ArrayList<Integer>> list = new ArrayList<>();
	for(int i = 0 ; i < arr.length() ; i++){
		int temp = arr[i];

		int left = i+1;
		int right = arr.length-1;
		while(left < right){
			int sum = temp + arr[left] + arr[right];
			if(sum == 0){
				list.add(Arrays.asList(temp,arr[left],arr[right]));
			}
			if(sum > 0){
				right--;
			}
			if(sum < 0){
				left--;
			}
		}

	}
	return list;
}
	public static void main(String[] args) {
		System.out.print(threeSum(new int[]{-1,0,1,2,-1,-4}));
	}
}