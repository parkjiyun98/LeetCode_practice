class Solution {
    public char findTheDifference(String s, String t) {
        char[] sC = s.toCharArray();
        char[] tC = t.toCharArray();
        Arrays.sort(sC);
        Arrays.sort(tC);

        for (int i = 0; i < s.length(); i++) {
            if(sC[i] !=  tC[i]){
                return tC[i];
            }
        }
        return tC[t.length()-1];
        
    }
}