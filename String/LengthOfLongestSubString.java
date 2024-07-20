class LengthOfLongestSubString {
    public int lengthOfLongestSubstring(String s) {
        if( s.length() == 1) return 1;
        HashMap<Character,Integer> set = new HashMap<>();
        int count = 0;
        int i = 0, start=0;
        while(i < s.length()){
            char c = s.charAt(i);
            if(set.containsKey(c)){
                start = Math.max(start,set.get(c)+1);//calculate where we have the last occurance of the repeating element;
                ;
               
            }
            set.put(c,i);
            count = Math.max(count,i-start+1);//range where elements are different in the sequence
            i++;
        }
       
        return count;
    }
}