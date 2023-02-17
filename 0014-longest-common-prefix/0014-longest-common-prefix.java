class Solution {
    public String longestCommonPrefix(String[] strs) {
        /*
        String result = "";
        HashSet<Character> set = new HashSet<>();
       
        for(int i = 0; i< strs[0].length(); i++){
            set.add(strs[0].charAt(i));
        }
        
        for(int i = 0; i< strs[1].length(); i++){
            for(int j = 0; j< strs[2].length(); j++){
                if(set.contains(strs[1].charAt(i)) && Character.compare(strs[1].charAt(i), strs[2].charAt(j)) == 0)
                    
                    result += Character.toString(strs[1].charAt(i));
            }
        }
        
        return result;
        */
        if (strs == null || strs.length == 0)
            return "";

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < first.length(); i++){
            if(first.charAt(i) != last.charAt(i) || i > last.length() - 1)
                return sb.toString();
            sb.append(first.charAt(i));
        }
        return sb.toString();
    }
}