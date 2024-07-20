// Given an integer array nums and an integer k, return the kth largest element in the array.

// Note that it is the kth largest element in the sorted order, not the kth distinct element.

// Can you solve it without sorting?
class KthLargestElement{
	public static int findKthLargest(int []arr,int k){
		int L = 0;
		int R = arr.length-1;
		int pivot_indx = 0;
		while(true){
			pivot_indx = partition(arr,L,R);
			// System.out.println(pivot_indx);
			if(pivot_indx == k - 1 ){
				return arr[pivot_indx];
			}else if(pivot_indx >= k-1){
				R = pivot_indx - 1;
			}else{
				L = pivot_indx + 1;
			}
			
		}
		
	}
	public static int partition(int nums[], int L,int R){
		int pivot = nums[L];
		int i = L+1;
		int j = R;
		while(i <= j){
			//change the < - > and > - < for finding the kth smallest elemennt
			 if(nums[i] > pivot && nums[j] > pivot){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if(nums[i] >= pivot){
                i++;
            }
            if(nums[j] <= pivot){
                j--;
            }
		}
		int t = nums[L];
		nums[L] = nums[j];
		nums[j] = t;
		return j;

	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,59,5,8,9,9};
		System.out.println(findKthLargest(arr,4));
	}
}