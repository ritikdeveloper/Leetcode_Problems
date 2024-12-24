class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int left=0;
        int right=1;
        int count=0;
        int sum=nums[0];
        while(right<nums.length){
        
        if(sum<k){
           sum+= nums[right];
            right++;
        }
        if(sum>k){
           sum-= nums[left];
           left++;
        }
        if(sum==k){
            count++;
            sum-=nums[left];
            left++;
        }

        }
        return count;
    

    }
}