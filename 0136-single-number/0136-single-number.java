class Solution {
    public int singleNumber(int[] nums) {
        /*
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return 0;
        */
        // Initialize the unique number...
        int uniqNum = 0;
        // TRaverse all elements through the loop...
        for (int idx : nums) {
            // Concept of XOR...
            uniqNum ^= idx;
        } return uniqNum;
    }
}