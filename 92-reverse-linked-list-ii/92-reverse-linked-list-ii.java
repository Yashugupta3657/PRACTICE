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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)
            return head;
        ListNode temp=head;
                int count=1;
        if(count==left){
            ListNode prev=null;
            ListNode end=null;
            while(temp!=null&&count!=right){
            ListNode temp1=temp.next;
            temp.next=prev;
            if(prev==null){
                end=temp;
            }
            prev=temp;
            temp=temp1;
                count++;
         }
             ListNode tempo=temp.next;
            temp.next=prev;
            prev=temp;
            temp=tempo;
        if(tempo!=null)
        end.next=tempo;
            return prev;
        }
        else{
        while(temp!=null&&count!=left-1){
            temp=temp.next;
            count++;
        }
        ListNode start=temp;
        temp=temp.next;
        ListNode prev=null;
        ListNode end=null;
        while(temp!=null&&count!=right-1){
            ListNode temp1=temp.next;
            temp.next=prev;
            if(prev==null){
                end=temp;
            }
            prev=temp;
            temp=temp1;
            count++;
        }
            ListNode tempo=temp.next;
            temp.next=prev;
            prev=temp;
            temp=tempo;
            start.next=prev;
        if(tempo!=null)
        end.next=tempo;
            return head;
        }
        // int count=1;
        // ListNode temp=head;
        // while(temp!=null&&count!=left-1){
        //     temp=temp.next;
        //     count++;
        // }
        
    }
}