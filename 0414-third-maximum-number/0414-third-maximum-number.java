class Solution {
    public int thirdMax(int[] nums) {
       int n=nums.length;
       Arrays.sort(nums);
       int count=0;
       for(int i=n-1;i>0;i--)
       {
        if(nums[i]!=nums[i-1])
        {
            count++;
        }
        if(count==2)
        {
            return nums[i-1];
        }
       }
       return nums[n-1];
        
    }
}