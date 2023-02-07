class Solution {
    public boolean isAnagram(String s, String t) {
        String[] sArr = s.split("");
        String[] tArr = t.split("");
        
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        
        if(Arrays.equals(sArr, tArr))
            return true;
        else
            return false;
    }
}