class Solution {
    public boolean canJump(int[] nums) {
        
        boolean[] dp = new boolean[nums.length];
        dp[nums.length-1]=true;

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>=nums.length-i-1){
                dp[i]=true;
            }

            int n=nums[i];
            int index=i;
            while(n>0){

                if(n+index<nums.length && dp[n+index]==true){
                    dp[index]=true;
                    n=0;
                }
                n--;
            }
        }
        return dp[0];
    }
}