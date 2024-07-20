 /*
So the problem statement here is, we have given an ARRAY, 
and we have to calculate the MAX sum of the subarray. 
Its also called  Kadane's Algorithm
 */
 class MaxSumSubarray{
	public static void maxSumSubarray(int[] arr){
		int curr_sum = arr[0];
		int max_sum = arr[0];

		for(int i = 1 ; i < arr.length ; i++){
			curr_sum = Math.max(arr[i],arr[i]+curr_sum);
			max_sum = Math.max(max_sum,curr_sum);
		}
		System.out.println(max_sum);

	} 
	public static void main(String[] args) {
		int arr[] = {-2,1,-3,4,-1,2,10,-5,4};
		maxSumSubarray(arr);
	}
}