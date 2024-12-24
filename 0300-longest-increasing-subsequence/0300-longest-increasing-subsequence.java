class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int maxLIS = 1; // At least one element in the subsequence

        // Initialize DP array: each element is a subsequence of length 1
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        // Bottom-up DP approach
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] < nums[j]) { // Increasing condition
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLIS = Math.max(maxLIS, dp[i]); // Update max LIS found so far
        }

        return maxLIS;
    }
}
