class Solution {
    public int mostWordsFound(String[] sentences) {
        int k=0;
        for(int i=0;i<sentences.length;i++)
        {
            String[] s=sentences[i].split(" ");
            int n=s.length;
            if(n>k)
            k=n;
        }return k;
    }
}