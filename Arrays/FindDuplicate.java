import java.util.*;
class FindMissingNo{
	public static boolean findDuplicate(int arr[]){
HashSet<Integer> set = new HashSet<>();
for(int i = 0 ; i < arr.length ; i++){
	if(set.contains(arr[i])){
		return true;
	}
	set.add(arr[i]);
}
return false;
}
	public static void main(String[] args) {
		int arr[] = {1,2,5,4,3};
		System.out.println(findDuplicate(arr));
	}
}