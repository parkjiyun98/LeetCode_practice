class Solution {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        
		HashSet<Character> set = new HashSet<Character>();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (set.contains(s.charAt(i))) {
				set.remove(s.charAt(i));
				count++;
			} else {
				set.add(s.charAt(i));
			}
		}
		if (!set.isEmpty()){
            return count * 2 + 1;
        }
		return count * 2;
        
    }
}