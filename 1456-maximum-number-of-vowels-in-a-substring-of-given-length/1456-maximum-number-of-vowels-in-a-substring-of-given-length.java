class Solution {

    public int maxVowels(String s, int k) {
        int left = 0;
        int right = k - 1;
        int currentVowelCount = 0;

        

        for (int i = 0; i <= right; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowelCount++;
            }
        }

        int maxVowels = currentVowelCount;
        left++;
        right++;

        while (right < s.length()) {
            if (isVowel(s.charAt(left - 1))) {
                currentVowelCount--;
            }

            if (isVowel(s.charAt(right))) {
                currentVowelCount++;
            }

            maxVowels = Math.max(maxVowels, currentVowelCount);

            left++;
            right++;
        }

        return maxVowels;
    }
    boolean isVowel(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }
}
