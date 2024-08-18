class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int a=jewels.length();
        int b=stones.length();
        int count=0;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                if(jewels.charAt(i)==stones.charAt(j))
                count++;
            }
        }
        return count;
    }
}