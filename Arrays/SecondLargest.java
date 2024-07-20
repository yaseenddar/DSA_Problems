// In this problem, we are fiding the second largest element in the array.
 // So we traverse the loop and find the 2nd largest and largest we will assign 
// 2nd largest largest where we find the largest element than largest.
 // And then we assign new largest to the largest and 
// update the value of largest to the new largest number 
// and return the second largest number at the end of the loop. 
class SecondLargest{
	public static int findSecondLargest(int []arr){
		int largest = Integer.MIN_VALUE; 
		int secondL = largest;
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] > largest){
				secondL = largest;
				largest = arr[i];
			}
		}
		return secondL;
	}
	public static void main(String[] args) {
		int arr[] = {5,1,6,3,122,33,4,4,55,66,1234,7,4,5,2,7,8,3};
		System.out.println(findSecondLargest(arr));
	}
}