class Solution {
    public int startStation(int[] gas, int[] cost) {
        // Your code here
        int n=gas.length;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n;i++){
            sum1+=gas[i];
            sum2+=cost[i];
        }
        
        if(sum2>sum1)return -1;//agar gas ka fuel cost se kam hai to loop nhi bneaga
        
        int currsum=0;
        int ans=0;
        for(int i=0;i<n;i++){
            currsum+=(gas[i]-cost[i]);
            if(currsum<0){
                currsum=0;
                ans=i+1;
            }
        }
        
        return ans;
        
    }
}