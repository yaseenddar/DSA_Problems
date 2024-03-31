public class quickSort {
    public static void quickSort(int arr[],int start,int end){

        if(start >= end){
            return;
        }
        int Index = partition(arr,start,end);
        quickSort(arr, start, Index-1);
        quickSort(arr, Index+1, end);

    }
    public static int partition(int arr[],int start,int end){
        int pivot = arr[end];
        int i = start -1;
        for(int j=start ; j< end ; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        i++;
        
        arr[end] = arr[i];
        arr[i] = pivot;
        return i;
    }
    public static void main(String [] args){
        int [] arr = {3,4,43,6,2,0,-2};
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        quickSort(arr,0,arr.length-1);
        System.out.println();

    for(int i = 0 ; i < arr.length ; i++){
        System.out.print(arr[i]+" ");
    }   
    }
}
