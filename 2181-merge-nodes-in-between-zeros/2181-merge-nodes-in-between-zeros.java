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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp1=null;
        ListNode run=null;
        ListNode temp=head.next;
        int sum=0;
        while(temp!=null){
            sum+=temp.val;
            if(temp.val==0){
            if(temp1==null){
                ListNode tt=new ListNode(sum);
                temp1=tt;
                run=temp1;
               }
                else{
                     ListNode tt=new ListNode(sum);
                    run.next=tt;
                    run=run.next;
                }
             sum=0;
          }
            temp=temp.next;
        }
        return temp1;
    }
}