class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int minIndex = 0;
        int result = 0;
        
        for(int i=0; i<prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
                minIndex = i;
            }
            if((prices[i] > min) && (i > minIndex)) {
                result = Math.max(result, prices[i] - min);
            }
        }
        return result;
    }
}