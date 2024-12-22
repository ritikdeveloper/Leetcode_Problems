class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        // Step 1: Count frequencies of each word using a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Step 2: Group words by their frequencies
        List<String>[] freqBuckets = new List[words.length + 1];
        for (String word : map.keySet()) {
            int freq = map.get(word);
            if (freqBuckets[freq] == null) {
                freqBuckets[freq] = new ArrayList<>();
            }
            freqBuckets[freq].add(word);
        }

        // Step 3: Sort words alphabetically within each frequency bucket
        for (int i = 0; i < freqBuckets.length; i++) {
            if (freqBuckets[i] != null) {
                Collections.sort(freqBuckets[i]);
            }
        }

        // Step 4: Collect the top K frequent words
        List<String> result = new ArrayList<>();
        for (int pos = freqBuckets.length - 1; pos >= 0 && result.size() < k; pos--) {
            if (freqBuckets[pos] != null) {
                for (String word : freqBuckets[pos]) {
                    if (result.size() < k) {
                        result.add(word);
                    }
                }
            }
        }

        return result;
    }
}
