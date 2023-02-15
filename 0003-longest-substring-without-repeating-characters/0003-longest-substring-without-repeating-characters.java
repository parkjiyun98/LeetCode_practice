class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0, front = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c) && map.get(c) >= front) {
                answer = Math.max(i - front, answer);
                front = map.get(c) + 1;
            }

            map.put(c, i);
        }
        answer = Math.max(s.length() - front, answer);

        return answer;
    }
}