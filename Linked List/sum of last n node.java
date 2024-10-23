class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        //intially
        Node cur=head,prev=head;
        int ans=0;
        while(cur!=null){
            ans+=cur.data;
            n--;
            if(n<0){
                ans-=prev.data;
                prev=prev.next;
            }
            cur=cur.next;
        }
        return ans;
    }
}