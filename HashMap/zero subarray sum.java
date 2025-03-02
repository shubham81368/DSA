class Solution {
    public int findSubarray(int[] arr) {
        // code here.
        int cnt=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        int csum=0;
        mp.put(0,1);
        
        for(int num:arr){
            csum+=num;
            if(mp.containsKey(csum)){
                cnt+=mp.get(csum);
            }
            mp.put(csum,mp.getOrDefault(csum,0)+1);
        }
        
        return cnt;
        
    }
}
