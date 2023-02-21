class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        /*
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int j = map.get(nums[i]);
                if (Math.abs(i - j) <= k)
                    return true;
                map.put(nums[i], i);
            } 
            else
                map.put(nums[i], i);
        }

        return false;
        */
        if (k == 0) return false;

        Set<Integer> slidingWindow = new HashSet<>();
        for (int index = 0; index < nums.length; index++) {
            if (slidingWindow.contains(nums[index]))
                return true;
            if (index >= k)
                slidingWindow.remove(nums[index - k]);
            slidingWindow.add(nums[index]);
        }
        return false;
    }
}