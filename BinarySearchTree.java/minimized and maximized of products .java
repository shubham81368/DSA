class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int l=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<quantities.length;i++){
            max=Math.max(max,quantities[i]);
        }
        int r=max;

        int result=0;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(mid,n,quantities)){
                result=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return result;
    }


    boolean isPossible(int x,int shops,int[] quantities){
        for(int product:quantities){
            shops-=(product+x-1)/x;//ceil value =(product/x) i.e  11/x
            if(shops<0)return false;
        }

        return true;
    }
}