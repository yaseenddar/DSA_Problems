class Solution {
    public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> result = new ArrayList<>();
        backtrack(new boolean[nums.length], nums,new ArrayList<>(),  result);
        return result;}
    public void backtrack(boolean used[], int [] nums,ArrayList<Integer> sub ,List<List<Integer>> result){
        if(sub.size() == nums.length){
            result.add(new ArrayList<>(sub));
            return;
        }
        
        for(int i = 0 ; i < nums.length;i++){
            if(used[i]) continue;
            used[i] = true;
            sub.add(nums[i]);
            backtrack(used,nums,sub,result);
            sub.remove(sub.size()-1);
            used[i]=false;
        }
    }
}
