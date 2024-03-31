class countingSort{

    public static void countingSort(int arr []){
        int largest = Integer.MIN_VALUE;
        for(int  i = 0 ; i < arr.length ; i++){
            largest = Math.max(largest, arr[i]);
        }
        
        int count[] = new int[largest+1];
        for(int i=0 ; i< arr.length ; i++){
            count[arr[i]]++;//doesn't store the negative values in the array
                            // because negative indexing is it allowed in the array
        }
        

        //now sorting this is important in the counting sort
        int j=0;//for asc order
        // int int j=arr.length-1; for desc order
        for(int i=0 ; i < count.length ; i++){
            while(count[i] > 0){
                arr[j]=i;
                j++;//for asc order
                // j--; for desc order
                count[i]--;
            }
        }
    }


    public static void main(String [] args){
        int [] arr = {3,4,43,6,2,0};
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        countingSort(arr);
        System.out.println();

    for(int i = 0 ; i < arr.length ; i++){
        System.out.print(arr[i]+" ");
    }   
    }
}