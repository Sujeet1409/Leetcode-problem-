class Solution {
    public void sortColors(int[] nums) {
    int z=0,x=0; 
        for(int i=0;i<nums.length;i++)
        {
    	    if(nums[i]==0)
        	    z++;
            else if(nums[i]==1)
            	x++;
        }       
        for(int i=0;i<z;i++)
        {
    	    nums[i]=0;
  	    }
        for(int i=z;i<x+z;i++)
        {
    	    nums[i]=1;
        }
        for(int i=x+z;i<nums.length;i++)
        {
    	    nums[i]=2;
        }
    }
}