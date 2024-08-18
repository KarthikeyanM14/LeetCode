class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int a=jewels.length();
        int b=stones.length();
        int count=0;
        int i=0;
        for(int j=0;j<b;j++)
        {
            if(j==b-1)
            {
                if(jewels.charAt(i)==stones.charAt(j))
                count++;
                j++;
            }
            
            if(j==b)
            {
                i++;
                j=0;
                if(i==a)
                {
                    break;
                }
            }
            if(jewels.charAt(i)==stones.charAt(j))
            {
                count++;
            }

        }
        return count;
    }
}