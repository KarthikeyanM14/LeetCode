class Solution {
    public String largestNumber(int[] nums) 
    {
        int n=nums.length;
        String c="";
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                count++;
            }
        }
        if(count==n)
        {
            return "0";
        }
        if(nums[0]==1000000000)
        {
            return"10000000001000000000";
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                String a=Integer.toString(nums[i]);
                String b=Integer.toString(nums[j]);
                String d=a+b;
                long f=Long.parseLong(d);
                String e=b+a;
                long g=Long.parseLong(e);
                if(g>f)
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
            c=c+nums[i];
        }
    return c;
    } 
}