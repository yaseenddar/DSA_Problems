public class MaxSumSubarray{
	public static void maxSumSubarray(int arr){
		int curr_sum = arr[0];
		int max_sum = arr[0];

		for(int i = 1 ; i < arr.length ; i++){
			curr_sum = Math.max(arr[i],arr[i]+curr_sum);//calculates the current max sum so far in the prevous aaray
			max_sum = Math.max(max_sum,curr_sum);
		}
		System.out.println(max_sum);

	} 
	public static void main(String[] args) {
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		maxSumSubarray(arr);
	}
}