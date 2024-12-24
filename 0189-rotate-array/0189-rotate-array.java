class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==0||nums.length==1){
            return ;
        }
        k=k%nums.length;
        //so first we will revse the array

        int start =0;
        int end = nums.length-1;
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

        //now we will normalize first k element;
        start=0;
        end=k-1;
        while(start<end){
           int temp = nums[start];
            nums[start] = nums[end];
            nums[end]=temp; 
            start++;
            end--;
        }
        //now we will reverse other elements;
        start = k;
        end=nums.length-1;
        while(start<end){
           int temp = nums[start];
            nums[start] = nums[end];
            nums[end]=temp;
            start++;
            end--; 
        }

    }
}