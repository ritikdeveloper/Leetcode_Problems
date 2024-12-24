class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        if(s.length()==0)return 0;
        if(s.length()==1)return 1;
        int max=1;
        map.put(s.charAt(0),0);
        int left=0;
        for(int right=1;right<s.length();right++){
            char ch =s.charAt(right);
            if(map.containsKey(ch) && map.get(ch)>=left){
                
                max=Math.max((right-left),max);
                left=map.get(ch)+1;
                map.put(ch,right);
            }
            else{
                map.put(ch,right);
            }
        }
        return max;
    }
}