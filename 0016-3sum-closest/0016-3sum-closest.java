class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int result = nums[0] + nums[1] + nums[2];
        for (int i=0;i<nums.length; i++)
        {
            int left=i+1, right= nums.length - 1;
            while(left<right)
            {
                int sum = nums[i]+nums[left]+nums[right];
                if(Math.abs(sum-target) < Math.abs(result-target)) 
                    result = sum;
                if(sum == target) 
                    return target;
                if(sum > target)
                    right--;
                else 
                    left++;
                
            }
        }
        return result;
    }
}