class Solution {
    Node primeList(Node head) {
        // code here
        Node curr=head;
        while(curr!=null){
            curr.val=closestPrime(curr.val);
            curr=curr.next;
        }
        return head;
    }
    
    
    int closestPrime(int n){
        if(isPrime(n))return n;
        int prev=n-1;
        int next=n+1;
        while(true){
        
        if(isPrime(prev))return prev;//first prev bcz if both equal return smallerst one
        if(isPrime(next))return next;
        prev--;
        next++;
    
    }
    }
    
    boolean isPrime(int n){
        if(n<=1)return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    
}