class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        s=s.toLowerCase();
        /*for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if((c>=65 && c<=90)||(c>=92&&c<=122)||(c>=48&&c<=57))
            {
                sb.append(c);
            }
        }*/
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        int i=0,j=sb.length()-1;
        while(i<j)
        {
            char c1=sb.charAt(i);
            char c2=sb.charAt(j);
            if(c1!=c2)
                return false;
            i++;
            j--;
        }
        return true;
    }
}