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
        // ListNode curr=head;
        // ListNode p1=null;
        // ListNode p2=null;
        // int len=0;
        // while(curr!=null){
          
        //     len++;
        //        if(len==k){
        //         p1=curr;
        //     }
        //     curr=curr.next;
        // }

        // curr=head;
        // for(int i=1;i<=len-k+1;i++){
        //     p2=curr;
        //     curr=curr.next;
        // }
        // int temp=p1.val;
        // p1.val=p2.val;
        // p2.val=temp;

        //     return head;

       ListNode curr=head;
        ListNode p1=null;
        ListNode p2=null;
       while(curr!=null){
        if(p2!=null){
            p2=p2.next;
        }
         k--;
           if(k==0){
            p1=curr;
            p2=head;
           }
           curr=curr.next;
       }
       int temp=p1.val;
       p1.val=p2.val;
       p2.val=temp;
       return head;
    }
}