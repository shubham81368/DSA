class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items,(a,b)->a[0]-b[0]);
        int ans[]=new int[queries.length];
      
        int maxBeauty=items[0][1];
        for(int i=1;i<items.length;i++){
            maxBeauty=Math.max(maxBeauty,items[i][1]);
            items[i][1]=maxBeauty;
        }
        // for(int i=0;i<queries.length;i++){
        //       int maxbeauty=0;
        //     for(int j=0;j<items.length;j++){
        //         if(items[j][0]<=queries[i])maxbeauty=Math.max(maxbeauty,items[j][1]);
        //         if(items[j][0]>queries[i])break;
             
        //     }
        //     ans[i]=maxbeauty;
        // }
            for(int i=0;i<queries.length;i++){
                int queryPrice=queries[i];
                ans[i]=customBinarySearch(items,queryPrice);
            }

        return ans;
    }

    int customBinarySearch(int[][] items,int queryPrice){
        int l=0;
        int r=items.length-1;
        int mid;
        int maxBeauty=0;
        while(l<=r){
            mid=l+(r-l)/2;
            if(items[mid][0]>queryPrice){
                r=mid-1;;
            }
            else{
                maxBeauty=Math.max(maxBeauty,items[mid][1]);
                l=mid+1;
            }
        }
        return maxBeauty;
    }
}