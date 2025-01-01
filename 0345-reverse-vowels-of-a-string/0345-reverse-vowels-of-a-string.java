import java.util.*;

class Solution {
    public String reverseVowels(String s) {
        char[] chs = s.toCharArray();
        int ptr1 = 0;
        int ptr2 = s.length() - 1;

        while (ptr1 < ptr2) {
            // Move ptr1 to the next vowel
            while (ptr1 < ptr2 && !isVowel(chs[ptr1])) {
                ptr1++;
            }
            // Move ptr2 to the previous vowel
            while (ptr1 < ptr2 && !isVowel(chs[ptr2])) {
                ptr2--;
            }
            // Swap vowels
            char temp = chs[ptr1];
            chs[ptr1] = chs[ptr2];
            chs[ptr2] = temp;

            // Move the pointers
            ptr1++;
            ptr2--;
        }
        return new String(chs);
    }

    // Helper method to check if a character is a vowel
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
