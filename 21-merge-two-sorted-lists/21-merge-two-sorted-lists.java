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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans=null;
        ListNode temp=null;
       while(list1!=null&&list2!=null){
           if(list1.val<=list2.val){
               if(ans==null){
                   ListNode m=new ListNode(list1.val);
                   ans=m;
                   temp=m;
               }
               else{
                    ListNode mn=new ListNode(list1.val);
                   temp.next=mn;
                   temp=temp.next;
               }
               list1=list1.next;
           }
            else{
               if(ans==null){
                   ListNode m=new ListNode(list2.val);
                   ans=m;
                   temp=m;
               }
               else{
                    ListNode mn=new ListNode(list2.val);
                   temp.next=mn;
                   temp=temp.next;
               }
                list2=list2.next;
           }
       }
        while(list1!=null){
            if(ans==null){
                 ListNode m=new ListNode(list1.val);
                ans=m;
                temp=m;
            }
            else{
           ListNode mn=new ListNode(list1.val);
            temp.next=mn;
            temp=temp.next;
            }
         list1=list1.next;
        }
        while(list2!=null){
             if(ans==null){
                 ListNode m=new ListNode(list2.val);
                ans=m;
                temp=m;
            }
            else{
           ListNode mn=new ListNode(list2.val);
            temp.next=mn;
            temp=temp.next;
            }
         list2=list2.next;
        }
        return ans;
    }
}