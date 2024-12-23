class Solution {
    public int minimumOperations(int[] nums) {
        int i=0;
        int counter=0;
        while(i<nums.length){
            if(checkdis(nums,i)){
                return counter;
            }
            i+=3;
            counter+=1;

        }
        return counter;
    }
    public boolean checkdis(int [] arr,int starting){

        HashSet<Integer> map = new HashSet<>();
        for(int i =starting;i<arr.length;i++){
            if(!map.add(arr[i])){
                return false;
            }
        }
        return true;
    }
}