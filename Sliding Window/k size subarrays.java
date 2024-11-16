class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        Arrays.fill(ans,-1);
        int cnt=1;
        for(int i=1;i<k;i++){
            if(nums[i]==nums[i-1]+1)cnt++;
            else{
                cnt=1;
            }
        }
        if(cnt==k)ans[0]=nums[k-1];
        int i=1;
        int j=k;
        while(j<n){
            if(nums[j]==nums[j-1]+1){
                cnt++;
            }
            else{
                cnt=1;
            }
            if(cnt>=k){
                ans[i]=nums[j];
            }
            i++;
            j++;
        }
        return ans;
    }
}