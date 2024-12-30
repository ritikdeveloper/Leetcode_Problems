class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int ptr1 = 0;
        int ptr2 = k - 1;
        
        int sum = 0;
        for (int i = 0; i <= ptr2; i++) {
            sum += nums[i];
        }
        
        int maxSum = sum;
        ptr1++;
        ptr2++;
        
        while (ptr2 < nums.length) {
            sum -= nums[ptr1 - 1]; 
            sum += nums[ptr2];   
            
            maxSum = Math.max(sum, maxSum); 
            ptr1++;
            ptr2++;
        }
        
        return (double) maxSum / k;
    }
}
