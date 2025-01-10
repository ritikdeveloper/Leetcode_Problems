class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        
        if (len1 > len2) return false;

        // Count frequencies of characters in s1
        int[] s1Count = new int[26];
        int[] windowCount = new int[26];
        for (char ch : s1.toCharArray()) {
            s1Count[ch - 'a']++;
        }

        // Sliding window over s2
        for (int i = 0; i < len2; i++) {
            // Add the current character to the window
            windowCount[s2.charAt(i) - 'a']++;

            // Remove the character left out of the window
            if (i >= len1) {
                windowCount[s2.charAt(i - len1) - 'a']--;
            }

            // Compare the frequency arrays
            if (areEqual(s1Count, windowCount)) {
                return true;
            }
        }

        return false;
    }

    // Helper function to compare two frequency arrays
    private boolean areEqual(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
