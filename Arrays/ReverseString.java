// Problem Statement 
// reverse the string without Resursion

class ReverseString{
	public static String helper(StringBuilder st , String s){
		if(s == ""){
			return st.reverse().toString();
		}
		st.append(s.charAt(0));
		return helper(st,s.substring(1));
	}
	public static String reverseString(String s){
		if(s == ""){
			return s;
		}
		return helper(new StringBuilder(),s);
	}

	// using StringBuilder
	public static String reverseString1(String s ){
		return new StringBuilder(s).reverse().toString();
	}
	public static String reverseString2(String s){
		if(s == ""){
			return s;
		}
		return reverseString2(s.substring(1))+s.charAt(0);
	}
	public static void main(String[] args) {
		String s = "hello GEHDFB WEGNB";
		s = reverseString2(s);
		System.out.println(s);
	}
}