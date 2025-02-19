  Node mergeKLists(List<Node> arr) {
        // Add your code here.
        Collections.sort(arr,(a,b)->(a.data-b.data));
        Node dummy=new Node(-1);
        Node d=dummy;
        for(Node curr:arr){
            while(curr!=null){
                d.next=new Node(curr.data);
                d=d.next;
                curr=curr.next;
            }
        } 
        d=dummy.next;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        while(d!=null){
            pq.offer(d.data);
            d=d.next;
        }
        dummy=new Node(-1);
        d=dummy;
        while(!pq.isEmpty()){
            d.next=new Node(pq.poll());
            d=d.next;
        }
        return dummy.next;
    }