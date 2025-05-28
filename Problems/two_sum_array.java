class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        
        // Try every pair (i, j) where i < j
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Check if the sum of nums[i] and nums[j] is equal to target
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        
        // If no such pair found
        return new int[] {}; // Or throw an exception
    }
}
