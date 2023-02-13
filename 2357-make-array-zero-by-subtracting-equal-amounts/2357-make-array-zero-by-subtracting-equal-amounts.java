class Solution {
    public int minimumOperations(int[] nums) {
        /*
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(i != 0)
            set.add(i);
        }
        return set.size();
        */
        int count = 0;
        if(nums.length == 0) return 0;
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i : nums) {
            if (i != 0)
                p.add(i);
        }
        while (!p.isEmpty()) {
            int size = p.size();
            int num = p.peek();//제일 작은 수
            for(int i = 0; i < size; i++){
                if(p.peek() - num == 0)
                    p.poll();
            }

            count++;
        }
       return count;
    }
}