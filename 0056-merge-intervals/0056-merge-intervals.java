class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
		
        ArrayList<int[]> overlap = new ArrayList<>();
        int start = intervals[0][0], end = intervals[0][1];
        
        for(int idx = 1 ; idx< intervals.length ; ++idx) {
        	if(intervals[idx][0] <= end) {
        		end = Math.max(end,intervals[idx][1]);
        	}else {
        		overlap.add(new int[] {start,end});
        		start = intervals[idx][0];
        		end = intervals[idx][1];
        	}
        }
        overlap.add(new int[] {start,end});
        
        return overlap.toArray(new int[1][overlap.size()]);
        /*
        int[][] answer = new int[overlap.size()][2];
        for(int i=0; i<overlap.size() ; ++i) 
        	answer[i] = overlap.get(i);
        
        return answer;
        */
    }
}