class Solution 
{
    public int minimumOperations(int[] nums) 
    {
        int minOperations = 0;
        for(int idx=0; idx < nums.length; idx++)
        {
            if(nums[idx]%3 != 0)
            {
                minOperations++;
            }
        }
        return minOperations;
    }
}