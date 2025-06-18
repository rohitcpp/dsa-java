//class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[128]; // ASCII characters
        int start = 0;
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // If character was seen in current window, move start
            if (lastSeen[c] > start) {
                start = lastSeen[c];
            }
            // Update max length
            maxLen = Math.max(maxLen, i - start + 1);
            // Store position of current character (1-based index)
            lastSeen[c] = i + 1;
        }

        return maxLen;
    }
}

//input = a b c a b c b b, output= 3, ans is abc length 3
//        0 1 2 3 4 5 6 7   (Indexes for each iteration)