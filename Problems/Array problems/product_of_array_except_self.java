public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] answer = new int[n];

    // Step 1: Left products
    answer[0] = 1;
    for (int i = 1; i < n; i++) {
        answer[i] = answer[i - 1] * nums[i - 1];
    }

    // Step 2: Right products
    int R = 1;
    for (int i = n - 1; i >= 0; i--) {
        answer[i] = answer[i] * R;
        R = R * nums[i];
    }

    return answer;
}

/*
 input: nums= [1,2,3,4]
 output: [24,12,8,6]
 */
