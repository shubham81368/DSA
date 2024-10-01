
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        Node p1=first;
        Node p2=second;
        long num1=0;
        long num2=0;
        long mod=1000000007;
        //first form first number
        while(p1!=null){
            num1=(num1*10+p1.data)%mod;
            p1=p1.next;
        }
        
        //for second number
        while(p2!=null){
            num2=(num2*10+p2.data)%mod;
            p2=p2.next;
        }
        
        return num1*num2;
    }
