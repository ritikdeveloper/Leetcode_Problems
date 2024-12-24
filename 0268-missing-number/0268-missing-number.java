class Solution {
    public int missingNumber(int[] nums) {
        int total=0;
        int totalnums=0;

        for(int i=0;i<nums.length;i++){
            totalnums+=nums[i];
            total+=(i+1);
            System.out.println(totalnums+" "+total);
        }
        return total-totalnums;
    }
}