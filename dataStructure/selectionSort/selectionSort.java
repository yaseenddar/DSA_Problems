// Initialize: Start with the first element of the array as the minimum.
// Find Minimum: Traverse the array to find the smallest element.
// Swap: Swap the smallest element with the first element.
// Repeat: Move to the next element and repeat steps 2-3 until the array is sorted.
public class selectionSort {
    
    public static void selectionSort(int []arr){
        for(int i = 0 ; i < arr.length - 1; i++){
            int position = i;
            for(int j = i + 1 ; j < arr.length ; j++){
                //left side of j is sorted and we find tonly in right side the minimun element
                //so to make less swaps in seelctoin sort
                if(arr[position] > arr[j]){
                    position = j;//find the smallest element's position
                    
                }
            }
            int temp = arr[i];
            arr[i] = arr[position];
            arr[position] = temp;

        }
    }

    public static void main(String[] args){
        int [] arr = {3,4,43,6,2,0,-2};
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        selectionSort(arr);
        System.out.println();

    for(int i = 0 ; i < arr.length ; i++){
        System.out.print(arr[i]+" ");
    }
}
}
