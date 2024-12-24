class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int num =nums[0];
        for(int i=0;i<nums.length;i++){
            if(count==0){

                num=nums[i];
            }
            count+=nums[i]==num?1:-1;
        }
        return num;
    }
}