class Solution {
    public int[] countBits(int n) {
        int[] num = new int[n + 1];    
        for(int i = 1; i <= n; i++){
            num[i] = num[i/2];
            if(i%2 == 1) num[i]++; 
        }
        return num;
    }
}