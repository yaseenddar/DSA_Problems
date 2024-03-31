
public class insertionSort {
    public static void insertionSort(int arr[]){
        for(int i=1 ; i < arr.length ; i++){
            int curr = arr[i];//store the value becz it will be changed after while loope
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr ){// for decreasing order change ">" to "<"
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion  
            arr[prev+1]= curr;
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
