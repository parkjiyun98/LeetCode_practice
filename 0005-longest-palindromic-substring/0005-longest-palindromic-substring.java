class Solution {
    public String longestPalindrome(String s) {
        /*
        String ret = "";
        for(int i=0 ; i<s.length() ; i++) {
            int len = Math.max(helper(s,i,i), helper(s,i,i+1));
            if(ret.length()<len) {
                ret = s.substring(i-(len-1)/2, i+len/2+1);
            }
        }
        return ret;
    }
    public int helper(String str, int s, int e) {
        if(s<0 || e>=str.length()) return 0;
        while(s>=0 && e<str.length() && str.charAt(s)==str.charAt(e)) {
            s--;
            e++;
        }
        return e-s-1;
        */
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}