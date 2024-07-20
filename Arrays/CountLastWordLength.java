// Problem Statement
// count the length of the last word in the String

class CountLastWordLength{
	public static int findLength(String s){
		int inx= s.length() - 1;
		while(s.charAt(inx) == ' '){
			inx--;
		}
		int count = 0;
		while(s.charAt(inx) != ' '){
			count++;inx--;

		}
		// System.out.print(count);

		return count;
	}
	// approach 2 universal and optimal
	public static int findLength2(String s){
		int count = 0;
		for(int i = s.length() - 1 ;i>=0; i--){
			if(s.charAt(i) != ' '){
				count++;
			}else{
				if(count > 0) return count;
			}

		}
		return count;
	}
	public static void main(String[] args) {
		String s = "gfbkj   ";
		System.out.print(s.toString());

		System.out.print(findLength2(s));
	}
}