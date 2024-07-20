//Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.



class removeDublicate{
    public String removeConsecutiveCharacter(String S){
        StringBuilder str = new StringBuilder();
        str.append(S.charAt(0));
        for(int i = 1 ; i < S.length() ; i++){
            if(S.charAt(i) != S.charAt(i-1)){
               str.append(S.charAt(i));
                
            }
        }
        return str.toString();
    }
}