class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
        Integer prevIndex = map.put(nums[i], i);  // put returns previous value if exists

        if (prevIndex != null && i - prevIndex <= k) {
            return true;
        }
    }

    return false;
}
}
/*
 nums=[1,2,3,1], k=3;
 
 */