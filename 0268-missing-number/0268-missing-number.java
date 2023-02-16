class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0, numsS = 0;
        
        for(int i=0; i<nums.length; i++) {
            sum += i;
            numsS += nums[i];
        }
        
        return sum + nums.length - numsS;
    }
}