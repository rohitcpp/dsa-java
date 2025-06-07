class NumArray {
    int n;
    int[] ans; // This stores the prefix sum

    public NumArray(int[] nums) {
        n = nums.length;
        ans = new int[n];
        ans[0] = nums[0];

        for (int i = 1; i < n; i++) {
            ans[i] = nums[i] + ans[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return ans[right]; // Directly use prefix sum
        } else {
            return ans[right] - ans[left - 1]; // Exclude left portion
        }
    }
}
