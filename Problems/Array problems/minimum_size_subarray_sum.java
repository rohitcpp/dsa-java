//class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            sum = sum + nums[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum = sum - nums[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
/*
 * target = 7
nums = [2, 3, 1, 2, 4, 3]
output should be= 2, [4,3]
 */