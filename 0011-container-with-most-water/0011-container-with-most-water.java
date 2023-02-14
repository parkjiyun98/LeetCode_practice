class Solution {
    public int maxArea(int[] height) {
        int start = 0, end = height.length - 1;
        int result = (end-start) * Math.min(height[start], height[end]);
        while(start < end){
            if(height[start] <= height[end])
                start++;
            else
                end--;
            result = Math.max((end-start)* Math.min(height[start], height[end]), result);
        }
        return result;
    }
}