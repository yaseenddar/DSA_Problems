// Bubble sort is a simple sorting algorithm that repeatedly steps through the list, 
// compares adjacent elements, and swaps them if they are in the wrong order. 
// It has a time complexity of O(n^2), making it inefficient for large datasets. 
// However,
// it is easy to implement and can be useful for small arrays or nearly-sorted data.

public class bubbleSort {
 // 6 8 4 0 6 3 O(n2)
    public static void bubbleSort(int []arr){
        for(int i = 0 ; i < arr.length - 1 ; i++){
            for(int j = 0 ; j < arr.length - 1 - i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    //compsrison with next element unitll  it reaches to the last
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String []argv){
        int [] arr = {1,4,3,6,8,7,5};
        
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        bubbleSort(arr);
        System.out.println();
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
