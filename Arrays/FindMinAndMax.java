class FindMinAndMax{
	public static void FindMinAndMax(int [] arr){
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] < min){
				min = arr[i];
			}
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.printf("Min = %d Max = %d",min,max);
	}
	public static void main(String[] args) {
		int arr[] = {2,100,4,7,9,8};
		FindMinAndMax(arr);
	}
}
