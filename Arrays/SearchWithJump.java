/*A step array is an array of integers where each element has a difference 
of at most k with its neighbor. Given a key x, we need to find the index 
value of x if multiple-element exist to return the first occurrence of the key.
Examples: 
 */
class SearchWithJump{

	public static int search(int arr[],int k){

		int i = 0;
		while(i < arr.length){
			if(arr[i] == k){
				return i;
			}
			int diff = Math.abs(arr[i] - k);
			int jump = Math.max(1,diff/k);
			i+=jump;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {2,3,4,5,4,5,6,5,6,7};
		System.out.print(search(arr,5));
	}
}