class Solution 
{
    public int search(int[] nums, int target) 
    {
        int l=0,u=nums.length-1; 
        while(l<=u)
        {
            int m=l+(u-l)/2;
            if(nums[m]==target)
            {return m;}
            else if(nums[m]>target)
            {u=m-1;}
            else
            {l=m+1;}
        }
        return -1;
    }
}