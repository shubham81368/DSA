//time complexity-O(n*logk);
//space complexity-o(k)
class Solution {
    public DLLNode sortAKSortedDLL(DLLNode head, int k) {
        // Code here
        PriorityQueue<DLLNode>pq=new PriorityQueue<>((o1,o2)->o1.data-o2.data);//o(k)
        
        DLLNode currHead=head;
        DLLNode ans=null,currans=null;
        
        while(currHead!=null){//o(N)
            pq.add(currHead);//O(log k)//for addining element in pq
            if(pq.size()==k+1){
                DLLNode pop=pq.remove();
                if(ans==null){
                    ans=pop;
                    currans=pop;
                }
                else{
                    currans.next=pop;
                    pop.prev=currans;
                    currans=currans.next;
                }
            }
            currHead=currHead.next;
        }
        
        while(!pq.isEmpty()){
            DLLNode pop=pq.remove();
            if(ans==null){
                ans=pop;
                currans=pop;
            }
            else{
                currans.next=pop;
                pop.prev=currans;
                currans=currans.next;
            }
        }
        ans.prev=null;
        currans.next=null;
        
        return ans;
        
    }
}