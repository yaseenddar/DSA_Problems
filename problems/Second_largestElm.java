class Second_largestElm{
	//User function Template for Java

class Solution {
    static int print2largest(int arr[], int n) {
        // code here
      if(n<2)
	return -1;
    int large=Integer.MIN_VALUE,second_large=Integer.MIN_VALUE;
    int i;
    for (i = 0; i < n; i++) 
    {
        if (arr[i] > large) 
        {
            second_large = large;
            large = arr[i];
        }
 
        else if (arr[i] >= second_large && arr[i] != large) 
        {
            second_large = arr[i];
        }
    }
     return second_large == Integer.MIN_VALUE ? -1 : second_large; //if all elements are same in the array       
    }
}
	public static void main(String[] args) {
		int arr= {642, 642, 642, 642, 642, 642, 642, 642, 642, 642, 642, 642, 642, 642}
		System.out.println(print2largest(arr,arr.length));
	}
}