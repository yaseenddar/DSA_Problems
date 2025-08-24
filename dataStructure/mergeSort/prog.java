package mergeSort;
class prog {
   public static void mergeSort(int [] arr,int start,int end){
        int mid = start + (end - start)/2;
        if(start >= end){
            return;
        }
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr,start,end,mid);
    }
    public static void merge(int[] arr, int start,int end, int mid) {
        int left = start;
        int right = mid+1;
        int k = 0;
        int temp[] = new int[end - start + 1];
        
        while(left <= mid && right <= end){
            if(arr[left] < arr[right]){
                temp[k] = arr[left];
                left++;
            }
            else{
                temp[k] = arr[right];
                right++;
            }
            k++;
        }
        //if some elements in the right array are left
        while(left <= mid){
            temp[k++] = arr[left++];
        }
        while(right <= end){
            temp[k++] = arr[right++]; 
        }
        for(int i = start, j=0; j < temp.length ; i++,j++){
            arr[i]=temp[j];
        }
    }


    // OTHER WAY 
        public static void mergesort2(int arr[],int left , int right){
        if(left < right){
            // 3,4,2,1,4,7,1
             int mid = left + (right - left) / 2;
                      

        mergesort(arr,left,mid);
        mergesort(arr,mid+1,right);
        merge(arr,left,mid,right);
        }
       
    }
    
    public static void merge2(int arr[], int left , int mid ,int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for(int i = 0 ; i < n1 ; i++){
            L[i] = arr[left+i];
        }
        for(int i = 0 ; i < n2 ; i++){
            R[i] = arr[mid + i + 1];
        }
        
        int k = left,i = 0, j = 0;
        
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k++] = L[i++];
            }else{
                arr[k++] = R[j++];
            }
        }
        
        while(i <  n1){
            arr[k++] = L[i++];
        }
        while(j < n2){
            arr[k++] = R[j++];
        }
    }
public static void  main(String [] args){

int arr[] = {4,3,7,5,9,1,0};

// before sort  
for(int i = 0 ; i < arr.length ; i++){
    System.out.print(arr[i]+" ");
 }
 System.out.println();
mergeSort(arr,0,arr.length-1);
// after sorting through the merge sort
    for(int i = 0 ; i < arr.length ; i++){
          System.out.print(arr[i]+" ");
       }
}

}
