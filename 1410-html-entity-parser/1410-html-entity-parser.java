class Solution {
    public String entityParser(String text) {
        /*
        HashMap<String, String> map = new HashMap<>();
        map.put("&amp", "&");
        map.put("&quot", "\"");
        map.put("&apos", "'");
        map.put("&gt", ">");
        map.put("&lt", "<");
        map.put("&frasl", "/");
        
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < text.length()) {
            if (text.charAt(i) == '&') {
                StringBuilder entity = new StringBuilder();
                while (text.charAt(i) != ';') {
                    entity.append(text.charAt(i));
                    i++;
                }
                
                String cur = entity.toString();
                if (map.containsKey(cur)) result.append(map.get(cur));
                else result.append(cur).append(";");
            } 
            else result.append(text.charAt(i));
            i++;
        }
        return result.toString();
        */
        text = text.replace("&gt;", ">");
        text = text.replace("&quot;", "\"");
        text = text.replace("&apos;", "'");
        text = text.replace("&lt;", "<");
        text = text.replace("&frasl;", "/");
        text = text.replace("&amp;", "&");
        
        return text;
    }
}