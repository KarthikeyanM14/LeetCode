class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> h=new HashMap<>();
        for(String s:strs)
        {
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String a=new String(c);
            if(!h.containsKey(a))
            {
                h.put(a,new ArrayList<>());
            }
            h.get(a).add(s);
        }
        res.addAll(h.values());
        return res;

    }
}