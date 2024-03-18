class prsctive {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		String str = "hi i am yaseen";
	
		System.out.println(str);
		char ch =(int) str.charAt(0) + 33;
		s.append(ch);
		int i = 0;
		ch = str.charAt(i);
		while(i < str.length()){
			ch = str.charAt(i);
			if(ch == ' '){
				s.append(ch);
				ch = str.charAt(i+1) + 33;
				
		}
		s.append(ch);
		i++;

	}
		System.out.println(s.toString());


}}