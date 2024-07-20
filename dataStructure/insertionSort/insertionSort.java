/*
Insertion Sort is a simple sorting algorithm that takes O(n^2) time in the worst case. Here's an example of how to implement insertion sort step by step:

Start from the second element in the list.
Compare the second element with the element before it. If the second element is smaller, swap the two elements.
Move the second element to the first element and continue this process until the end of the list.
When you reach the end of the list, the largest element will be in its final position.
Repeat steps 1-4 for the rest of the elements in the list, ignoring the already sorted elements. 6
*/
// it manges the two arrays one is sorted on left and another is unsorted on the right
public class insertionSort {
    public static void insertionSort(int arr[]){
        for(int i=1 ; i < arr.length ; i++){
            int curr = arr[i];//store the value becz it will be changed after while loope
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr ){
            // for decreasing order change ">" to "<"
                arr[prev+1] = arr[prev];// it copies the prev values at prev+1
                                        // it does't store curr to this positoin
                prev--;
            }
            //insertion  
            arr[prev+1]= curr;// to insert the curr in the rt position of the array
                //if pos  = -1;
                // po + 1 = 0 = curr that is at first position
        }
    }
    public static void main(String [] args){
        int [] arr = {3,4,43,6,2,0,-2};
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        insertionSort(arr);
        System.out.println();

    for(int i = 0 ; i < arr.length ; i++){
        System.out.print(arr[i]+" ");
    }   
    }
    
}
