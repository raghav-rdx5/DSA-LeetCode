class Solution {
    public int majorityElement(int[] nums) 
    {
        int i,j;
        for(i=0;i<nums.length;i++)
        {
            int k =0;
            for(j=0;j<nums.length;j++)
            {
            if(nums[i]==nums[j])
            k++;
            }
            if(k>(nums.length/2))
            return nums[i];
        }    
        return -1;   
    }
}