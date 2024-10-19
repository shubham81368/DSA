class Solution {
    //t.c=(n)
    //s.c=o(n)
    public char findKthBit(int n, int k) {
        //base case
        if(n==1)return '0';
        
        int len=(1<<n)-1;//2^n-1

        if(Math.ceil(len/2.0)>k){
            return findKthBit(n-1,k);
        }
        else if(Math.ceil(len/2.0)==k){
            return '1';
        }
        else{
            char ch=findKthBit(n-1,len-(k-1));
            return ch=='0'?'1':'0';
        }
    }
}