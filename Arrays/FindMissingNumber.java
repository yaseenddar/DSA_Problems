import java.util.Arrays;
public class FindMissing{

public static void findMissing(int arr[]){
	Arrays.sort(arr);// 0 1 3 4 5 6 
	for(int i = 0; i < arr.length ; i++){
		if(arr[i] != i){
			System.out.printf("found %d misiing %d",arr[i],i);
			return;
		}
	}
}
	public static void main(String[] args) {
		int arr[] = {1,0,6,3,4,2,8,5};
		findMissing(arr);
	}
}