class Solution {
    public String mergeAlternately(String a, String b) {
        String s="";
        if(a.length()==b.length())
        {
            for(int i=0;i<a.length();i++)
            {
                s=s+a.charAt(i)+b.charAt(i);                
            }
        }
        else if(a.length()<b.length())
        {
            for(int i=0;i<a.length();i++)
            {
                s=s+a.charAt(i)+b.charAt(i);
            }
            for(int i=a.length();i<b.length();i++)
            {
                s=s+b.charAt(i);
            }
        }
        else
        {
            for(int i=0;i<b.length();i++)
            {
                s=s+a.charAt(i)+b.charAt(i);
            }
            for(int i=b.length();i<a.length();i++)
            {
                s=s+a.charAt(i);
            }
        }
        return s;
    }
}