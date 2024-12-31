class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans  = new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        combiSum(ans,current,0,1,n,k);
        return ans;
    }
    public void combiSum(List<List<Integer>> ans ,List<Integer> current,int sum,int index,int n,int k){
        if(current.size()==k && sum==n){
            ans.add(new ArrayList<>(current));
            return;
        }
        if(current.size() >k || sum>n){
            return;
        }
         for (int i = index; i <= 9; i++) { // Numbers are between 1 and 9
            current.add(i);
            combiSum(ans, current, sum + i, i + 1, n, k); // Move to the next index
            current.remove(current.size() - 1); // Backtrack
        }

    }
}