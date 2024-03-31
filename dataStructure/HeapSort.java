// Problem Statement
// sort the array using the heap

class HeapSort{

	public static void heapify(int i,int []arr,int n){
		int leftChild = 2 * i + 1;
		int rightChild = 2 * i + 2;
		int larIndx = i;
		if(leftChild < n  && arr[leftChild] < arr[larIndx] ){
			larIndx = leftChild;
		}
		if(rightChild < n && arr[rightChild] < arr[larIndx] ){
			larIndx = rightChild;
		}

		// now swap the minIndx element to the parent and make the max heap
		if(larIndx != i){
			int temp = arr[i];
			arr[i] = arr[larIndx];
			arr[larIndx] = temp;
			heapify(larIndx,arr,n);
		}
	}

	public static void heapSort(int [] arr){
		for(int i = arr.length / 2 - 1; i >= 0 ; i--){
			heapify(i,arr,arr.length);
		}
		// swap the largest to last
		for(int i = arr.length - 1 ; i >= 0 ; i--){
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(0,arr,i);
		}
}
	public static void main(String[] args) {
		int arr[] = {1,4,2,5};
		heapSort(arr);
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
	}
}