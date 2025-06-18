//public String minWindow(String s, String t) {
    int[] tFreq = new int[128];
    int[] windowFreq = new int[128];

    for (char ch : t.toCharArray()) {
        tFreq[ch]++;
    }

    int left = 0, right = 0;
    int count = 0; // how many characters matched
    int minLen = Integer.MAX_VALUE;
    int start = 0;

    while (right < s.length()) {
        char rChar = s.charAt(right);
        windowFreq[rChar]++;

        // if this char is needed and not overused
        if (tFreq[rChar] > 0 && windowFreq[rChar] <= tFreq[rChar]) {
            count++;
        }

        // when all characters are matched
        while (count == t.length()) {
            // update min window
            if (right - left + 1 < minLen) {
                minLen = right - left + 1;
                start = left;
            }

            // try to move left to shrink window
            char lChar = s.charAt(left);
            windowFreq[lChar]--;
            if (tFreq[lChar] > 0 && windowFreq[lChar] < tFreq[lChar]) {
                count--;
            }
            left++;
        }

        right++;
    }

    return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
}
