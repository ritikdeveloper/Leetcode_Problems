class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] ds = new boolean[nums.length];
        permute(ans,curr,nums,ds);
        return ans;
    }
    public void permute(List<List<Integer>> ans , List<Integer> curr,int[] nums,boolean[] ds){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<ds.length;i++){
            if(!ds[i]){
                ds[i]=true;
                curr.add(nums[i]);
                permute(ans,curr,nums,ds);
                ds[i]=false;
                curr.remove(curr.size()-1);
            }
        }
    }
}