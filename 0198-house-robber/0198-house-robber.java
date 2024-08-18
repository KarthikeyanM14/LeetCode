class Solution {
    public int rob(int[] nums) {
        int n =nums.length;
        if(n==0)
        {
            return 0;
        }
        int sum=0;
        int sum1=0;
        for(int num:nums)
        {
            int temp=sum;
            sum=Math.max(sum1+num,sum);
            sum1=temp;
        }
        return sum;
    }
}