import java.util.*;
class CountFrequencyOfChars{
	public static void count(String str){
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i = 0; i < str.length() ; i++){
			char c =str.charAt(i);
			if(map.containsKey(c)){
				map.put(c,map.get(c)+1);
			}else{
				map.put(c,1);
			}
		}
		for(Map.Entry<Character,Integer> entry : map.entrySet()){
			if(entry.getValue() >= 1){
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		} 
	}
	public static void main(String[] args) {
		count("geeksforgeeks");
		
	}
}