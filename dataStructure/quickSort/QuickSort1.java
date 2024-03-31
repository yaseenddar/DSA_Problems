// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class QuickSort1{
    public static int findPos(int arr[],int start,int end){
        int pivot = start;
        int left = start;
        int right = end;

        while(left < right){
            // change the "<" to ">" and viceversa for desc and asc order
            while(arr[left] < arr[pivot]){
                left++;
            }
            while(arr[right] > arr[pivot]){
                right--;
            }
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            
        }
        // System.out.print(arr[start]+" ");

        int temp = arr[right];
        arr[right] = arr[pivot];
        arr[pivot] = temp;
        return right;
    }
    public static void quickSort(int arr[],int start,int end){
        if(start < end){
         int position = findPos(arr,start,end);
        // System.out.print(position+" ");

        quickSort(arr,start,position-1);
        quickSort(arr,position+1,end);        }
       
    }
    public static void main(String[] args) {
    int arr[]= {4,2,6,0,7,34,8,1};
    //     for(int i = 0 ; i < arr.length ; i++){
    //     System.out.print(arr[i]+" ");
    // }
    quickSort(arr,0,arr.length -1);
    for(int i = 0 ; i < arr.length ; i++){
        System.out.print(arr[i]+" ");
    }
    }
}