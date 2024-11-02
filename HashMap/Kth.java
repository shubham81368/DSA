class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                int d=i-mp.get(arr[i]);
                if(d<=k)return true;
            }
            else{
                mp.put(arr[i],i);
            }
        }
        return false;
    }
}