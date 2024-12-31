class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans  = new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        combiSum(ans,current,nums,0,target);
        return ans;
    }
    public void combiSum(List<List<Integer>> ans,List<Integer> current,int[] nums,int index,int target){
        int sum = 0;
        for(int i=0;i<current.size();i++){
            sum+=current.get(i);
            
        }
        if(sum==target){
            ans.add(new ArrayList<>(current));
            return;
        }
        if(sum>target){
            return;
        }
        if(index>=nums.length){
            return;
        }

        current.add(nums[index]);
        combiSum(ans,current,nums,index,target);
        current.remove(current.size()-1);
        combiSum(ans,current,nums,index+1,target);
    }
}