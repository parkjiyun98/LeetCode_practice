class Solution {
    public List<String> letterCombinations(String digits) {
        Map<String, List<String>> map = new HashMap<>();
        map.put("2", List.of("a", "b", "c"));
        map.put("3", List.of("d", "e", "f"));
        map.put("4", List.of("g", "h", "i"));
        map.put("5", List.of("j", "k", "l"));
        map.put("6", List.of("m", "n", "o"));
        map.put("7", List.of("p", "q", "r", "s"));
        map.put("8", List.of("t", "u", "v"));
        map.put("9", List.of("w", "x", "y", "z"));
        
        List<String> result = new ArrayList<>();
        
        if (digits.length() == 0) {
            return result;
        } else if (digits.length() == 1) {
            return map.get(digits);
        }
        String digit = digits.substring(0, 1);
        List<String> left = map.get(digit);
        List<String> right = letterCombinations(digits.substring(1));
        for (int i = 0; i < left.size(); i++) {
            String leftS = left.get(i);
            for (int j = 0; j < right.size(); j++) {
                String rightS = right.get(j);
                result.add(leftS + rightS);
            }
        }
        return result;
        
    }
}