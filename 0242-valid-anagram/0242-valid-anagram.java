class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] sArr = new char[s.length()];
        char[] tArr = new char[t.length()];
        
        for(int i = 0 ; i < s.length() ;i++){
            sArr[i] = s.charAt(i);
        }
        
        for(int i = 0 ; i < t.length() ;i++){
            tArr[i] = t.charAt(i);
        }
        
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        
        if(Arrays.equals(sArr, tArr))
            return true;
        else
            return false;
    }
}