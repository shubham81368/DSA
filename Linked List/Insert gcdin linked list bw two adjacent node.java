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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy =head;//here dummy use to store all linked list
        //head use as an iterator to trverse linked list
        while(head!=null && head.next!=null){
            int gcd = hcf(head.val,head.next.val);
            ListNode currNext=head.next;
            head.next=new ListNode(gcd,currNext);
            //ab head ke next me gcd store hoga phir currNext store hoga;
            head=head.next.next;

        }
        
        head=dummy;//why we again store in head because traverse karte hue haed null pe aa gya hai isliye
        return head;
    }

    int hcf(int a, int b){
        int s=a<b?a:b;
        int ans=1;
        for(int i=1;i<=b;i++){
          if(a%i==0 && b%i==0){
            ans=i;
          }
        }
        return ans;
    }
}