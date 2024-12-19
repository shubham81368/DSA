class Solution {
    public int maxChunksToSorted(int[] arr) {
        // int psum=0;
        // int isum=0;
        // int chunkscnt=0;
        // for(int i=0;i<arr.length;i++){
        //     psum+=arr[i];
        //     isum+=i;
        //     if(psum==isum){
        //      chunkscnt++;
        //     }
        // }
        // return chunkscnt;

        int n=arr.length;
        int[] prefixmax=new int[n];
         
        int[] suffixmin=new int[n];
        
        //prefixmax
        prefixmax[0]=arr[0];
        for(int i=1;i<n;i++){
            prefixmax[i]=Math.max(arr[i],prefixmax[i-1]);
        }
        //suffix min
        suffixmin[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suffixmin[i]=Math.min(suffixmin[i+1],arr[i]);
        }
          int partition=0;
        for(int i=0;i<n;i++){
            int pahalekamax=i>0?prefixmax[i-1]:-1;
            int baadkemin=suffixmin[i];
            if(pahalekamax<baadkemin){
                partition++;
            }
        }
        return partition;
    }
}