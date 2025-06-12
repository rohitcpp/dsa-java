public class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26]; // count for A-Z
        int left = 0;
        int maxCount = 0; // max frequency in window
        int result = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            count[c - 'A']++;

            // update maxCount of any character in the window
            maxCount = Math.max(maxCount, count[c - 'A']);

            // if too many changes are needed
            if ((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--; // remove from window
                left++; // shrink window
            }

            // update result
            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
/*
 Example 1:
Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.
 */