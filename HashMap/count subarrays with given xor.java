    public long subarrayXor(int arr[], int k) {
        // code here
        int xor=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);
        long cnt=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];//total xor
            
            int x=xor^k;
            if(mp.containsKey(x)){
                cnt+=mp.get(x);
            }
            mp.put(xor,mp.getOrDefault(xor,0)+1);
        }
        return cnt;
    }
    