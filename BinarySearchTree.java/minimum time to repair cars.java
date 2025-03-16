class Solution {
    public long repairCars(int[] ranks, int cars) {
        long start=Integer.MAX_VALUE;
        long end=Integer.MIN_VALUE;
        for(int rank:ranks){
            start=Math.min(start,rank);
            end=Math.max(end,rank);
        }  
           end=end*cars*cars;
           long ans=0;
           while(start<=end){
              long mid=start+(end-start)/2;
              if(isPossible(ranks,cars,mid)){
                ans=mid;
                end=mid-1;
              }
              else{
                start=mid+1;
              }

           }
           return ans;
    }

    boolean isPossible(int[] ranks,int cars,long time){
        long carRepaired=0;
        for(int rank:ranks){
            carRepaired+=(long)(Math.sqrt((1.0*time)/rank));
            if(carRepaired>=cars)return true;
        }
        return false;
    }
}