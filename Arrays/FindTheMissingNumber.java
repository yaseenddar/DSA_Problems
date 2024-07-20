class FindTheMissingNumber{
	public static int findMissing(int[] arr){
	// (1)	  //OPTIMAL SOLUTION
		// int val = 0;
		// for(int i = 0 ; i < arr.length ; i++){
		// 	val ^= arr[i] ^ i;
		// }
		// return val ^ arr.length;
	// (2)    // 2ND SOLUTION	
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] != i){
				return i;
			}
		}
		return arr.length;
	}
	public static void main(String[] args) {
		int arr[] = {0,1,2,3,4,5,6,8};
		System.out.println(findMissing(arr));
	}
}