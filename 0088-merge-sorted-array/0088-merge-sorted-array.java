class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        nums2 = Arrays.copyOfRange(nums2, 0, n);

        System.arraycopy(nums2, 0, nums1, m, nums2.length);

        Arrays.sort(nums1);
    }
}