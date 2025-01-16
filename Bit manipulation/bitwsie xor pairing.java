class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int xor=0;
        if(n%2==1){
        for(int i=0;i<m;i++){
           xor^=nums2[i];
        }}

        if(m%2==1){
            for(int num:nums1){
                xor^=num;
            }
        }

        return xor;
    }
}