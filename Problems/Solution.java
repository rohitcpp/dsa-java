public class Solution {
    public int longestSubstring(String s, int k) {
        // Base case: if the string length is less than k, return 0
        if (s.length() < k) return 0;

        // Frequency array to count occurrences of each character
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Check for characters that occur less than k times
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] < k) {
                // Split the string and find the longest valid substring in both parts
                return Math.max(longestSubstring(s.substring(0, i), k), 
                                longestSubstring(s.substring(i + 1), k));
            }
        }

        // If all characters occur at least k times, return the length of the string
        return s.length();
    }
}

/*
Example 1:

Input: s = "aaabb", k = 3
Output: 3
Explanation: The longest 
substring is "aaa", as 'a' is repeated 3 times. 
 */