
/*A permutation of an array of integers is an arrangement 
of its members into a sequence or linear order.\

NextPermutation means next number from the given array if 123 then next is 132

For example, for arr = [1,2,3], 
the following are all the permutations of arr: 
[1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an */
class NextPermutation{
public static void nextPermutation(int arr[]){
	int i = arr.length -2;
	while(i>=0 && arr[i] >= arr[i+1]) i--;
	int j = arr.length-1;
	while(j >= 0 && arr[j] <= arr[i]) j--;
	int t = arr[i];
	arr[i] = arr[j];
	arr[j] = t;
	j = arr.length-1;
	i++;
	while(i<=j){
	t = arr[i];
	arr[i] = arr[j];
	arr[j] = t;
	i++;j--;
	}  
}

	public static void main(String[] args) {
		int arr[] = {2,4,6,1,7,4,3};
		nextPermutation(arr);
		for(int i :arr){
			System.out.print(i+" ");
		}
	}
}