// this questoin removes the duplicates from the strinf using t he recursion 
import java.util.*;
public class removeDuplicates {
    //through iteraton
    public static String removeDup(String s){
    StringBuilder ans = new StringBuilder();
    boolean arr[] = new boolean[26];
    for(int i = 0 ; i < s.length() ; i++){
        char c = s.charAt(i);
        int index = c - 'a';
        if(arr[index]){
            continue;
        }else{
            arr[index] = true;
            ans.append(c);
        }
       

    }
    return ans.toString();
    } 

    //by recursoin
    public static void removeDupRecursion(String s,int index,StringBuilder ans, boolean []map){
        if(index == s.length()){
            System.err.println(ans);
            return;
        }
        int i = s.charAt(index) - 'a';

        if(map[i]){
            removeDupRecursion(s, index+1, ans, map);
        }else{
            ans.append(s.charAt(index));
            map[i] = true;
            removeDupRecursion(s, index+1, ans, map);
        }
        

    }

    public static String usingHashMap(String s){
        HashSet<Character> set = new HashSet<>();
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(!set.contains(c)){
                 str.append(c);
                // System.out.print(c);
                set.add(c);
            }
        }
        return str.toString();
    }
    public static void main(String [] args){
    String s = "yyasseennjdfkjshdjnnn shfddks";
    StringBuilder str = new StringBuilder();
    // boolean map[] = new boolean[26];
    System.out.println(usingHashMap(s));



    // for(int i = 1 ; i < s.length() ; i++){
    //     if(s.charAt(i) != s.charAt(i-1)){
    //         str.append(s.charAt(i-1));
    //     }
    // }
    // System.out.println(str.append(s.charAt(s.length()-1)).toString()+" \n");

    // }
}
}
