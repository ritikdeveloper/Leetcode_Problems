import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(nums); 
        combiSum(nums, target, ans, current, 0);
        return ans;
    }

    private void combiSum(int[] nums, int target, List<List<Integer>> ans, List<Integer> current, int index) {
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            current.add(nums[i]);
            combiSum(nums, target - nums[i], ans, current, i + 1); 
            current.remove(current.size() - 1); 
        }
    }
}
