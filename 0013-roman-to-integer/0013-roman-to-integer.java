class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);
        
        int result = 0;

        for (int i = 0; i < s.length(); ) {
            String twoCh = s.substring(i, Math.min(s.length(), i + 2));
            String oneCh = s.substring(i, i + 1);

            if (map.containsKey(twoCh)) {
                result += map.get(twoCh);
                i += 2;
            } else {
                result += map.get(oneCh);
                i++;
            }
        }

        return result;
    }
}