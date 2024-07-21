// Given an array nums with n objects colored red, white, or blue, 
// sort them in-place so that objects of the same color are adjacent, 
// with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.

class SortColors{
	public static void swap(int arr[],int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void sort(int arr[]){
		int right = arr.length - 1;
		int left = 0,i=0;
		while(i <= right){
			if(arr[i] == 2){
				swap(arr,i,right);
				right--;

			}else if(arr[i] == 0){
				swap(arr,i,left);
				left++;i++;

			}else{
				i++;
			}
		}
	}
	public static void main(String[] args) {
		int [] arr = {0,0,1,0,1,2,1,1,2,2,0,1,2,2};
		sort(arr);
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
	}
}