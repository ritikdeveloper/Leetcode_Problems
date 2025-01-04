class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())return false;
        int[] s1=new int[26];
        int[] s2=new int[26];
        
        for(char ch:word1.toCharArray()){
            s1[ch - 'a']++;
        }
        System.out.println(Arrays.toString(s1));
        for(char ch:word2.toCharArray()){
            s2[ch - 'a']++;
        }
        for(int i=0;i<26;i++){
            if((s1[i]==0 && s2[i]!=0) || (s1[i]!=0 && s2[i]==0))return false;
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1,s2);


    }
}