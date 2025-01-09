import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Add the current number and its index to the map
            map.put(nums[i], i);
        }

        // Return null if no solution is found
        return null;
    }
}
