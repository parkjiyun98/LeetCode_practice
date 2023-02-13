class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        result.add(list);
        for(int i=1; i<rowIndex+1; i++) {
            list = new ArrayList<>();
            list.add(1);
            for(int j=1; j<i; j++){
                int x = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                list.add(x);
            }
            list.add(1);
            result.add(list);
        }
        return result.get(rowIndex);
    }
}