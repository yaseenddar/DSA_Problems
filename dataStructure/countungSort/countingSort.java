// Counting sort is a simple and efficient sorting algorithm that can sort elements of an unbounded integer stream. 
// It works by counting the number of elements with each value in the input stream and then generating an output 
// stream that corresponds to the count distribution. 
// The algorithm has a time complexity of O(n + k), 
// where n is the number of elements in the input 
// stream and k is the maximum value of the elements. 
// It is particularly useful for sorting data with a known range of values and can be 
// implemented in a variety of programming languages and environments.
// (1) store the count of all elements to the indices 
// (2) then sort in desc or asc order at every index util the frequency is 0 then move to the next index.


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
        // (2) then sort in desc or asc order at every index util 
        //the frequency (count[i]) is 0 then move to the next index.

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