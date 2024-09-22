class Solution {
    public int findKthNumber(int n, int k) {
       int curr=1;
       k-=curr;//because ham ne first element cosider kar liya hai 
       while(k>0){
        int count=helper(curr,curr+1,n);
        if(count<=k){
            curr++;
            k-=count;//skip the no. under current prefix tree
        }
        else{//same tree me he traverse karna hai isliye multiply by 10 kiya hai
            curr*=10;
            k-=1;
        }
       }
       return curr;
    }

    public int helper(long curr,long next,long n){
       int countNum=0;
       while(curr<=n){
        countNum+=(next-curr);
        curr*=10;
        next*=10;
        next=Math.min(next,n+1);
       }
       return countNum;
    }
}