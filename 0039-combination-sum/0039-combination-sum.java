class Solution {
  public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        combination(0, nums, target, 0, ans, temp);
        return ans;
    }

    public void combination(int index,int[] nums,int target,int current,List<List<Integer>> ans,List<Integer> ans1){
        if(current == target){
            ans.add(new ArrayList<>(ans1));
            return;
        }
       if (current > target || index >= nums.length) {
            return;
        }
                for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue; 
            }
                }

        ans1.add(nums[index]);
        combination(index,nums,target,current+nums[index],ans,ans1);
        ans1.remove(ans1.size()-1);
        combination(index+1,nums,target,current,ans,ans1);


    }
}