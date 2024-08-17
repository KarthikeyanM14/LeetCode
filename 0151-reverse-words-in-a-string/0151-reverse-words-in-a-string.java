class Solution {
    public String reverseWords(String s) {
        String[] st=s.trim().split("\\s+");
        String str="";
        for(int i=st.length-1;i>0;i--)
        {
            str+= st[i] +" ";
        }
    return str+st[0];
    }
}