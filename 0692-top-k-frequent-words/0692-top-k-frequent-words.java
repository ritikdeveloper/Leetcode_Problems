class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        List<String>[] ans = new List[words.length];
        for(String word:map.keySet()){
            int fre = map.get(word);
            if(ans[fre]==null){
                ans[fre]=new ArrayList<>();
             }
            ans[fre].add(word);
        }


        for(int i =0;i<ans.length;i++){
            if(ans[i]!=null){
                Collections.sort(ans[i]);
            }
        }
      
        List<String> result = new ArrayList<>();
        for (int pos = ans.length - 1; pos >= 0 && result.size() < k; pos--) {
            if (ans[pos] != null) {
                for (String word : ans[pos]) {
                    if (result.size() < k) {
                        result.add(word);
                    }
                }
            }
        }
        return result;



    }
}