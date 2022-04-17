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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int moves=count-n-1;
        if(moves<0){
            return head.next;
        }
        while(moves>0&&temp!=null){
            moves--;
            temp=temp.next;
        }
        if(temp.next!=null){
        ListNode store=temp.next.next;
        temp.next=null;
        temp.next=store;
        }
        else{
            temp.next=null;
        }
        return head;
    }
}