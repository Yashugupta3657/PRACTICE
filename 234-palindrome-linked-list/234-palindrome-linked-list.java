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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        Stack<Integer> m=new Stack<>();
        if(head.next==null)
            return true;
        if(head.next.next==null){
            if(head.val!=head.next.val)
                return false;
                return true;
        }
           while (fast != null && fast.next != null)
            {
                fast = fast.next.next;
                slow= slow.next;
            }
        fast=slow;
        while(slow!=null){
            m.push(slow.val);
            slow=slow.next;
        }
       
        while(head!=fast){
            if(!m.isEmpty()&&m.pop()!=head.val){
                return false;
            }
            head=head.next;
        }
        if(!m.isEmpty()&&head.val!=m.pop()){
            return false;
        }
        if(m.isEmpty())
            return true;
        return false;
    }
}