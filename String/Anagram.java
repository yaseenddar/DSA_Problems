/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different 
word or phrase, typically using all the original letters exactly once.

 */


import java.util.*;
class Anagram{

	public static boolean anagram(String s,String t){
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i = 0; i < s.length() ; i++){
			if(map.containsKey(s.charAt(i))){
				map.put(s.charAt(i),map.get(s.charAt(i))+1);

			}else map.put(s.charAt(i),1);
		}

		for(int i = 0; i < t.length(); i++){
			if(!map.containsKey(t.charAt(i))){
				return false;
			}else map.put(t.charAt(i),map.get(s.charAt(i))-1);
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.print(anagram("anagram","gravmana"));
	}
}