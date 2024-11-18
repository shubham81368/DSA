class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int ans[]=new int[n];
         if(k==0){
            for(int i=0;i<n;i++){
                ans[i]=0;
            }
            return ans;
         }
         
         int i=-1,j=-1;
         if(k>0){
            i=1;
            j=k;
         }
         else{
            i=n-Math.abs(k);
            j=n-1;
         }

         int windowSum=0;
         for(int pointer=i;pointer<=j;pointer++){
            windowSum+=code[pointer];
         }

         for(int x=0;x<n;x++){
            ans[x]=windowSum;
            windowSum-=code[i%n];
            i++;
            windowSum+=code[(j+1)%n];
            j++;
         }
         return ans;


    }

   
}