class Solution {
    public void sortColors(int[] nums) {
        //Arrays.sort(nums);
        /*
        int x = 0;
        int y = 0;
        for (int z = 0; z < nums.length; z++) {
            int v = nums[z];
            nums[z] = 2;
            if (v < 2) nums[y++] = 1;
            if (v == 0) nums[x++] = 0;
        }
        */
        int x =0, y=0, z=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
                x++;
            else if(nums[i]==1)
                y++;
            else
                z++;
        }
        
        int i=0;
        while(x>0)
        {
            nums[i]=0;
            i++;
            x--;
        } 
        
        while(y>0)
        {
            nums[i]=1;
            i++;
            y--;
        }
        
        while(z>0)
        {
            nums[i]=2;
            i++;
            z--;
        }
    }
}