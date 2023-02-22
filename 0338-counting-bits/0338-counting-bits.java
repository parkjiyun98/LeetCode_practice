class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
      
        for (int i = 0; i < n+1 ; i++) {
            if (result[i] != 0) continue;
            result[i] = result[i/2] + i % 2;
        }
        
        return result;
    
    }
}