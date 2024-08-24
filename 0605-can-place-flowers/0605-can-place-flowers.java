class Solution {
    public boolean canPlaceFlowers(int[] bed, int n) 
    {
          int count=0;
        if(n==0)
        {
            return true;
        }
        if(bed.length==1)
        {
            if(bed[0]==0 && n==1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        if(bed.length>1)
        {
            if(bed[0]==0 && bed[1]==0)
            {
                bed[0]=1;
                count++;
            }
            if(bed[bed.length-1]==0 && bed[bed.length-2]==0)
            {
                bed[bed.length-1]=1;
                count++;
            }
        }
      
        for(int i=1;i<bed.length;i++)
        {
            if(bed[i-1]==0 && bed[i]==0 && bed[i+1]==0)
            {
                bed[i]=1;
                count++;
            }
        }
        if(count>=n)
        {
            return true;
        }
        return false;
    }
}