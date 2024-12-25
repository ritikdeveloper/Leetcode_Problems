class Solution {
    public int maxSubArray(int[] nums) {
        
        int left=0;
       
        int maxsum=nums[0];
         int sum=0;
        while(left<nums.length){
            if(sum<0){
                sum=0;
            }
            sum+=nums[left];
            maxsum=Math.max(maxsum,sum);
            left++;
            }

        
        return maxsum;
    }
}