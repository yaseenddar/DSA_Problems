
// this problem includes reaching to the last index bu jumping from curr i + nums[i] if yes return true
// else return false
class JumpGame{
	public static boolean jump(int arr[]){
		int target = arr.length-1;

		for(int i =  arr.length-2 ; i >=0 ; i--){
			// start from reverse the loop if we can reach the target 
			// then update the target to cuurent inedx ,means now we 
			// just have to ith target from ith to last of array is calculated
			if(i+arr[i] >= target){
				target = i;// new target set first is reached
			}
		}
		return target == 0;
	}

	// In this problem we are supposed to return 
	// the minimum number of jumps to reach the end of the array
	public static int numOfJumps(int arr[]){
		int target = 0;
		int count = 0;
		for(int i = 0 ; i < arr.length ; i++){
			if(i+arr[i] > target){
				//we check if we can cross the max target reached by previous jumps
				// if yes then we set now target + new jump
				//  e.g., if at 0th jump target is zero and jump we can make max is arr[0] = 3
				// i.e., > target(=0) then we update for next window
				// after that we compare for next jump if is possible to reach more than target
				// then target = i + nums[i] for next window;
				target = i +arr[i];
				count++;
			}
			if(target >= arr.length-1) return count;
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[] = {10,2,1,2,1,4};
		System.out.println(numOfJumps(arr));
	}
}