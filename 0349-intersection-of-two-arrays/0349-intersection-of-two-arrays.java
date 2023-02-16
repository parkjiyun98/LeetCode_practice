class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        
        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            set2.add(nums2[i]);
        }
        int[] result = new int[set.size()];
        int i = 0;
        
        for (int num : set) {
            if (set2.contains(num)) {
                result[i++] = num;
            }
        }
        
        return Arrays.copyOf(result, i);
    }
}