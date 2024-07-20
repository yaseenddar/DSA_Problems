//Problem Statement 
// find the largest sum of the sub array in contigious 

class SumOfSubArray{
	public static int SumOfSubArray(int arr[]){
		int max_sum = arr[0];
		int curr_max_sum = arr[0];

		for(int i = 0 ; i < arr.length ; i++){
			curr_max_sum = Math.max(arr[i],arr[i]+curr_max_sum);//calcualtes the previous sum and finds the max sum
			max_sum = Math.max(max_sum,curr_max_sum);// finds the max sum in current sum and previous sum 
		}
		return max_sum;
	}
	public static void main(String[] args) {
		int arr[] = {-2,-5,6,-2,-3,8,1,5,-6};
		System.out.println(SumOfSubArray(arr));
	}
}