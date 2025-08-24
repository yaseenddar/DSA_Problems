/*You are given a string num, representing a large integer. 
Return the largest-valued odd integer (as a string) 
that is a non-empty substring of num, or an empty string "" if no odd integer exists.
A substring is a contiguous sequence of characters within a string.

Input: num = "35427"
Output: "35427"
Explanation: "35427" is already an odd number.
*/

class FindLargestOdd {
    public String largestOddNumber(String num) {
        String largest = "";
       // start traversing from right because if last number is odd it is the largest odd
        // if not last then we find when the first odd number is found from last
        if(num.length() == 0) return "";
        for(int i =  num.length() - 1  ; i >= 0 ; i--){
            int  n = num.charAt(i);
             
            if(n % 2 != 0){
              return num.substring(0,i+1);// first odd number is found 
            }
        }
        return "";
    }
}