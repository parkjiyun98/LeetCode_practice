class Solution {
    public int singleNumber(int[] nums) {
        /*
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return 0;
        */
        int i=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for( i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
              int n=list.indexOf(nums[i]);
             list.remove(n);
            }else if(!list.contains(nums[i])){
                list.add(nums[i]);
            }                     
        }
         return  list.get(0);
    }
}