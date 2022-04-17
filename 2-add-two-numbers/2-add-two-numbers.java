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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        int carry=0;
        ListNode temp=null;
        ListNode move=null;
        while(l1!=null||l2!=null){
            int p=0,q=0;
            if(l1!=null)
                p=l1.val;
            if(l2!=null)
                q=l2.val;
            int sum=p+q+carry;
            carry=sum/10;
            if(temp==null){
                temp=new ListNode(sum%10);
                move=temp;
            }
            else{
                move.next=new ListNode(sum%10);
                move=move.next;
            }
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }
        if(carry>0){
            move.next=new ListNode(carry);
        }
        return temp;
    }
}