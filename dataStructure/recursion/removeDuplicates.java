// this questoin removes the duplicates from the strinf using t he recursion 
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
    public static void main(String [] args){
    String s = "yyasseennn";
    StringBuilder ans = new StringBuilder();
    boolean map[] = new boolean[26];
    removeDupRecursion(s,0,ans,map);
    System.out.println(s+" \n");

    }
}
