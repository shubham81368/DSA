class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=arr.length;
        int qs=queries.length;
      //here prefix xor created
        int[] prefXor = new int[n];
        prefXor[0]=arr[0];

        for(int i=1;i<n;i++){
            prefXor[i]=prefXor[i-1]^arr[i];
        }
        //now traverse on quries
        int ans[]=new int[qs];
        for(int i=0;i<qs;i++){
           int l=queries[i][0];
           int r=queries[i][1];
            if(l==0)ans[i]=prefXor[r];
            else ans[i]=prefXor[l-1]^prefXor[r];
        }
        return ans;
    }
}