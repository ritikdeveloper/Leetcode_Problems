class Solution {
    public int longestSubarray(int[] nums) {
        int countZero = 0;
        int right = 0;
        int left = 0;
        int maxOnes = 0;
        int prezero = -1; 
        
        while (right < nums.length) {
            if (nums[right] == 0) {
                countZero++;
                
                if (countZero > 1) {
                    maxOnes = Math.max(maxOnes, right - left - 1);
                    left = prezero + 1;
                    countZero--; 
                }
                
                prezero = right; 
            }
            
            right++; 
        }
        
        return Math.max(maxOnes, right - left - 1);
    }
}
