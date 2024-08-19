class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int len=0;
        int n=s.length();
        for(int i=n-1;i>=0;i--)
        {
            if(s.charAt(i)!=' '){
                len++;
            }
            else 
            {
                return len;
            }
        }
       return len;
    }
}