// Problem statement 
// rotate the array to the left k times;
class rotateLeft{
	public static void rotate(int []arr,int k){
		int temp[] = new int[arr.length];
		int j=0;
		for(int i = k ; i < arr.length ; i++){
			temp[j++] = arr[i];
		}
		for(int i = 0 ; i < k ; i++){
			temp[j++] = arr[i];
		}
		for(int i = 0 ; i < temp.length ; i++){
			System.out.print(temp[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		rotate(arr,3);
	}
}