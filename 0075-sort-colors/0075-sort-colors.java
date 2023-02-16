class Solution {
    public void sortColors(int[] nums) {
        //Arrays.sort(nums);
        int x = 0;
        int y = 0;
        for (int z = 0; z < nums.length; z++) {
            int v = nums[z];
            nums[z] = 2;
            if (v < 2) nums[y++] = 1;
            if (v == 0) nums[x++] = 0;
        }
    }
}