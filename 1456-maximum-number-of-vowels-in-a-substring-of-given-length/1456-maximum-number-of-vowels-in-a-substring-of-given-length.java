class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int right = k-1;
        int vowelCount=0;
        for(int i=0;i<=right;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') vowelCount++;

        }


        int totalMax=vowelCount;
        left++;
        right++;
        while(right<s.length()){
            if(s.charAt(left -1)=='a'||
            s.charAt(left -1)=='e'||
            s.charAt(left -1)=='i'||
            s.charAt(left -1)=='o'||
            s.charAt(left -1)=='u')
            vowelCount--;
            if(s.charAt(right)=='a'||
            s.charAt(right)=='e'||
            s.charAt(right)=='i'||
            s.charAt(right)=='o'||
            s.charAt(right)=='u') 
            vowelCount++;
            totalMax=Math.max(totalMax,vowelCount);
            right++;
            left++;

        }
        return totalMax;
    }
}