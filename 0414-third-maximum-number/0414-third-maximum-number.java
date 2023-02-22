class Solution {
    public int thirdMax(int[] nums) {
        /*
        Integer[] tmp = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        HashSet<Integer> hashSet = 
                new HashSet<>(Arrays.asList(tmp));
        Integer[] resultArr = hashSet.toArray(new Integer[0]);
        Arrays.sort(resultArr, Comparator.reverseOrder());
        if(resultArr.length >= 3) return resultArr[2];
        else return resultArr[0];
        */
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;
    }
}