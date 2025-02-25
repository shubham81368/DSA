class Solution {
    public int numOfSubarrays(int[] arr) {
        int csum=0;
        int even=1;
        int odd=0;
        int cnt=0;
        int n=arr.length;
        int m=(int)(1e9+7);
        for(int i=0;i<n;i++){
            csum+=arr[i];
            if(csum%2==0){
                cnt=(cnt+odd)%m;
                even++;
            }
            else{
                cnt=(cnt+even)%m;
                odd++;
            }
        }
        return cnt;
    }
}