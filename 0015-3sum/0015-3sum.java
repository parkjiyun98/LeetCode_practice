class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            //결과값 중복 x 
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum < 0) {
                    low++;
                    continue;
                }
                if (sum > 0) {
                    high--;
                    continue;
                }
                result.add(List.of(nums[i], nums[low], nums[high]));
                while (low < high && nums[low + 1] == nums[low]) {
                    low++;
                }
                while (low < high && nums[high - 1] == nums[high]) {
                    high--;
                }
                low++;
                high--;
            }
        }
        return result;
    }
}