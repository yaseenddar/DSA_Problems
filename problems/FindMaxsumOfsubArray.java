import java.util.*;
class FindMaxsumOfsubArray{
  /*(1) find the largest sum of the the Array 
    we store the sum of prev largest
    and we compare to the max nums[curr] and prev sum + nums[curr]
    we compare the Max max_sum and current sum of the sum array */
    public static int maxSubArray(int[] nums) {

        
       int curr_sum = nums[0];
       int max_sum = nums[0];
       for(int i = 1 ; i < nums.length ; i++){
        curr_sum = Math.max(nums[i],nums[i]+curr_sum);
        max_sum = Math.max(curr_sum,max_sum);
       }   
       return max_sum;
    
}

// In this questoin that we are about to find the longest subarray that has sum equal to k

public static int longestSubArray(int nums[] , int k){
	int len = Integer.MIN_VALUE;
	int sum = 0;
	HashMap<Integer,Integer> map = new HashMap<>();//store all previous sums
	for(int i = 0 ; i < nums.length ; i++){
			sum += nums[i];//

			int rem = sum - k;//cal rem for every new sum 
			// the logic here is that when we sum - k now it will have the rem 
			// if rem is present in map it means from that rem sum in array to curr sum is the sequence 
			 // 10 15 17 24 25 29
			  // here 24 - 15 = 10 which is present at 0 th indx 
			// means from 10 to 24 is the 15 sum = k;
			if(map.containsKey(rem)){
				// if the rem is found in he map it means the sequence is present in the arrays
				int l = i - map.get(rem);
				len = Math.max(len ,l);
			}else{
					

				map.put(sum,i);
				System.out.println(map.get(rem));
			}
	}
	return len;
}//-5 0 -2 9 10 
public static void main(String[] args) {
	int arr [] =  {10,5, 2, 7, 1, 9};
	System.out.println(maxSubArray(arr));

	// longest subarray whose sum is k
	System.out.println(longestSubArray(arr,15));
}
}

