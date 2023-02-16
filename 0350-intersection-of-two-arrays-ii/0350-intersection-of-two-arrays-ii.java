class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        /*
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return list.stream().mapToInt(x -> x).toArray();
        */
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        int i; 
            
        for(i = 0; i < nums1.length; i++)
        {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
        }

        for(i = 0; i < nums2.length; i++)
        {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0)
            {                
                list.add(nums2[i]);                        
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }
        int [] arr = new int[list.size()];

        for(i = 0; i < list.size(); i++)
        {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}