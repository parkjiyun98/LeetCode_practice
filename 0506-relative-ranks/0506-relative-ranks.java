class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] arr = Arrays.copyOf(score, score.length);
        Arrays.sort(score);
        String[] result = new String[score.length];
        for(int i=0; i<score.length; i++){
            for(int j=0; j<score.length; j++){
                if(arr[i] == score[j]){
                    int rank = score.length - j;
                    String x = String.valueOf(rank);
                    if(rank==1) 
                        x = "Gold Medal";
                    if(rank==2)
                        x = "Silver Medal";
                    if(rank==3)
                        x = "Bronze Medal";
                    result[i] = x;
                }
            }
        }
        return result;
        
    }
}