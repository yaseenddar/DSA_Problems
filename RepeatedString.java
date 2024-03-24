// Problem Statement
// find the count of the letter a in the string if string is repested infinite times
class RepeatedString{
	public static void main(String[] args) {
		String s = "aba";
		long n = 1000000;
		 long count = 0;

       
        int j = 0;
        int len = s.length();
        
        // find the repeated number of string
        long repeatedString = n / len;
        
        while(j < len){
            if(s.charAt(j) == 'a'){
                ++count;
            }
            j++;
        }
            long leftCounts = n - (len * repeatedString);
            
            
            int extra = 0;
            for(int k = 0 ; k < leftCounts ; k++){
                if(s.charAt(k) == 'a'){
                    ++extra;
                }
            }
            long totalCount = extra + count * repeatedString;
            System.out.println(totalCount);

	}
}