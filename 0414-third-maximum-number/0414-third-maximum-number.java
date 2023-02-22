class Solution {
    public int thirdMax(int[] nums) {
        Integer[] tmp = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        HashSet<Integer> hashSet = 
                new HashSet<>(Arrays.asList(tmp));
        Integer[] resultArr = hashSet.toArray(new Integer[0]);
        Arrays.sort(resultArr, Comparator.reverseOrder());
        if(resultArr.length >= 3) return resultArr[2];
        else return resultArr[0];
    }
}