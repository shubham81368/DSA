class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] ans=new int[n];
        int cnt=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(A[i],mp.getOrDefault(A[i],0)+1);
            if(mp.get(A[i])==2){
                cnt++;
            }
            mp.put(B[i],mp.getOrDefault(B[i],0)+1);
            if(mp.get(B[i])>1){
                cnt++;
            }
            ans[i]=cnt;
        }
        return ans;
    }
}