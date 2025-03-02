class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        // TreeMap<Integer,Integer>mp=new TreeMap<>();
        // for(int i=0;i<nums1.length;i++){
        //     mp.put(nums1[i][0],nums1[i][1]);
        // }
        // for(int i=0;i<nums2.length;i++){
        //     if(mp.containsKey(nums2[i][0])){
        //         int num=mp.get(nums2[i][0]);
        //         num+=nums2[i][1];
        //         mp.put(nums2[i][0],num);
        //     }
        //     else{
        //         mp.put(nums2[i][0],nums2[i][1]);
        //     }
        // }
        // int[][] ans=new int[mp.size()][2];
        // int i=0;
        // for(int key:mp.keySet()){
        //     ans[i][0]=key;
        //     ans[i][1]=mp.get(key);
        //     i++;
        // }
        //    return ans;

        ArrayList<int[]>ans=new ArrayList<>();
        int i=0;
        int j=0;
        int n=nums1.length;
        int m=nums2.length;
        while(i<n && j<m){
            if(nums1[i][0]==nums2[j][0]){
                ans.add(new int[]{nums1[i][0],nums1[i][1]+nums2[j][1]});
                i++;
                j++;
            }
            else if(nums1[i][0]<nums2[j][0]){
                ans.add(new int[]{nums1[i][0],nums1[i][1]});
                i++;
            }
            else{
                ans.add(new int[]{nums2[j][0],nums2[j][1]});
                j++;
            }
        }

        while(i<n){
            ans.add(new int[]{nums1[i][0],nums1[i][1]});
            i++;
        }

        while(j<m){
            ans.add(new int[]{nums2[j][0],nums2[j][1]});
            j++;
        }

        int s=ans.size();
        int res[][]=new int[s][2];
        for(int k=0;k<s;k++){
            int[] a=ans.get(k);
            res[k][0]=a[0];
            res[k][1]=a[1];
        }
        return res;
    }
}