/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode temp=head;
        int helper=0;
        ListNode make=new ListNode(0);
        ListNode ans=make;
        Stack<ListNode> st=new Stack<ListNode>();
        while(temp!=null){
            ListNode curr=temp;
            temp=temp.next;
            curr.next=null;
            st.push(curr);
            if(st.size()==2){
                make.next=st.pop();
                make=make.next;
                make.next=st.pop();
                make=make.next;
            }   
        }
        if(st.size()>0){
            make.next=st.pop();
        }
        return ans.next;
    }
}