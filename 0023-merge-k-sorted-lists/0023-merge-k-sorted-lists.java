
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List <Integer> list =new ArrayList<>();
        for(int i=0;i<=lists.length-1;i++)
        {
            ListNode temp=lists[i];
            while(temp!=null)
            {
                list.add(temp.val);
                temp=temp.next;
            }
        } 
        Collections.sort(list);
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        for(int i=0;i<list.size();i++)
        {
            ListNode cur=new ListNode(list.get(i));
            temp.next=cur;
            temp=cur;
        }
        return dummy.next;
    }
}