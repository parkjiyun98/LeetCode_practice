class Solution {
    public String intToRoman(int num) {
        /*
        StringBuilder res = new StringBuilder();
        String[] roman ={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int []values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        int i = 0;
        while(num > 0){
            while(num >= values[i]){
                num -= values[i];
                res.append(roman[i]);
            }
            i++;
        }
        return res.toString();
        */
        Comparator<Integer> comparator = Comparator.reverseOrder();
        TreeMap<Integer,String> map = new TreeMap<Integer,String>(comparator);
        map.put(1000,"M");
        map.put(900, "CM");
        map.put(500,"D");
        map.put(400, "CD");
        map.put(100,"C");
        map.put(90, "XC");
        map.put(50,"L");
        map.put(40, "XL");
        map.put(10,"X");
        map.put(9, "IX");
        map.put(5,"V");
        map.put(4, "IV");
        map.put(1,"I");
               
        StringBuilder sb = new StringBuilder();
        for (int key : map.keySet()) {
            while (num >= key) {
                sb.append(map.get(key));
                num -= key;
            }
            
            if (num == 0) break;
        }
        
        return sb.toString();
        
    }
}