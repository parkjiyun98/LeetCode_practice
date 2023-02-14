class Solution {
    public boolean canJump(int[] nums) {
        int distance = 0;
        for (int i = 0; i <= distance; i++) {
            distance = Math.max(distance, i + nums[i]);
            if (distance >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}