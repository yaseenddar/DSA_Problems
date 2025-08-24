class FindInRotated{
	public static int findInRotated(int arr[] , int target){
		int left = 0;
		int right = arr.length - 1;
		int mid;
		while(left <= right){
		mid = (left + right)/2;
		if(arr[mid] == target){
			return mid;
		}
		// conditoin check if mid is right half or right half
		if(arr[left] <= arr[mid]){//
			// then only check for left half
		if(target < arr[mid] && target >= arr[left]){

			right = mid - 1;

		}else{

		left = mid + 1;

		}

		}else{
			// if left is > mid means mid is right half
			// so we go the right half of the array
			if(target > arr[mid] && target <= arr[right]){

				left = mid +1;

			}else{

				right = mid -1;
			}
		}
		
	}
return -1;
}
	public static void main(String[] args) {
		int arr[] = new int[]{3,4,5,6,0,1,2};
		System.out.println(findInRotated(arr,10));
	}
}