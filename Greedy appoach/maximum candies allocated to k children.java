class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max=0;
        long total=0;
        int n=candies.length;
        for(int num:candies){
            max=Math.max(num,max);
            total+=num;
        }
        if(total<k)return 0;

        int s=1;
        int e=max;
        int res=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(canDistribute(candies,k,mid)){
               res=mid;
               s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
           return res;
    }


    public boolean canDistribute(int[] candies,long k,int mid){
        long cnt=0;
        for(int i=0;i<candies.length;i++){
            cnt+=candies[i]/mid;

            if(cnt>=k)return true;
        }
        return cnt>=k;
    }
}