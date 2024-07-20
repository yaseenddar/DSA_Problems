/*
You are given an array prices where prices[i] 
is the price of a given stock on the ith day.

You want to maximize your profit by choosing 
a single day to buy one stock and choosing a 
different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. 
If you cannot achieve any profit, return 0.
*/
class BuyAndSell{
	public static int maxPro(int[]arr){
		int minPr = Integer.MAX_VALUE;
		int maxPro = 0;
		for(int i = 0 ; i < arr.length ; i++){
			minPr = Math.min(minPr,arr[i]);
			maxPro = Math.max(maxPro,arr[i]-minPr);
		}
		return maxPro;
	}

	public static void main(String[] args) {
		int []arr= {7,1,5,3,6,4};
		System.out.println(maxPro(arr));
	}
}