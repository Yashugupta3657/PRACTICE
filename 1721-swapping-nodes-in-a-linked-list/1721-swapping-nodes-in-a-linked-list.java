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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 1; i < k; i += 1) {
            fast = fast.next;
        }
        ListNode front = fast;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        swapVal(front, slow);
        return head;
    }
    
    public void swapVal(ListNode node1, ListNode node2) {
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
    }  
}
// class Solution {
//     public ListNode swapNodes(ListNode head, int k) {
//         if(head.next==null)
//             return head;
//         ListNode temp=head;;
//         int size=1;
//         int store1=0;
//         int store2=0;
//         while(temp!=null){
//             if(size==k){
//                 store1=temp.val; 
//             }
//             if(temp.next!=null)
//             size++;
//             temp=temp.next;
//         }
//         int till=size-k+1;
//         temp=head;
//         size=1;
//         while(temp!=null){
//             if(size==till)
//             {
//                 store2=temp.val;
//                 temp.val=store1;
//                 break;
//             }
//             size++;
//             temp=temp.next;
//         }
//         temp=head;
//         size=1;
//         while(temp!=null){
//             if(size==k){
//                 temp.val=store2;
//                 break;
//             }
//             size++;
//             temp=temp.next;
//         }
//         return head;
//     }
// }