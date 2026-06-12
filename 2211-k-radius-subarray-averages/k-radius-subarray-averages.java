class Solution 
{
    public int[] getAverages(int[] nums, int k) 
    {
        int n = nums.length;
        int[] avgs = new int[n];
        int windowsize = 2 * k + 1;
        long windowsum = 0;
        int left = 0;
        for(int right=0;right<n;right++)
        {
            windowsum += nums[right];
            if(right < windowsize - 1)
            {
                avgs[right] = -1;
                continue;
            }
            int center = right - k;
            avgs[center] = (int)(windowsum / windowsize);
            windowsum -= nums[left];
            left++;
        }
        for(int i=n - k;i<n;i++)
        {
            if(i>=0 && i<n)
            {
                avgs[i] = -1;
            }
        }
        return avgs;
    }
}                         