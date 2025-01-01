import java.util.Arrays;

class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        if (n == 0) {
            return true; // No flowers need to be placed.
        }
        int len = nums.length;
        
        if (len == 1) {
            return nums[0] == 0 && n <= 1; // Only one spot available.
        }
        
        // Check the first plot.
        if (nums[0] == 0 && nums[1] == 0) {
            nums[0] = 1;
            n--;
        }
        if(n==0){
            return true;
        }
        

        // Check the last plot.
        if (nums[len - 1] == 0 && nums[len - 2] == 0) {
            nums[len - 1] = 1;
            n--;
        }
        if(n==0)return true;

        for (int i = 1; i < len - 1; i++) {
            if (nums[i] == 0 && nums[i - 1] == 0 && nums[i + 1] == 0) {
                nums[i] = 1;
                n--;
                if (n == 0) {
                    return true; // Early exit if no more flowers are needed.
                }
            }
        }

        return n == 0; // Return true if all flowers are placed.
    }
}
