class Solution {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        int count = amount[0] + amount[1] + amount[2];
        if(amount[0] + amount[1]> amount[2])  
            return count/2+ count%2; 
        else if(amount[0]==0 && amount[1]==0)  
            return amount[2]; 
        else  
            return amount[2];  
    }
}