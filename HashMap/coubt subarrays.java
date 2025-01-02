  public int countSubarrays(int arr[], int k) {
        // code here

        int n=arr.length;
        int psum=0;
        
        HashMap<Integer,Integer>mp=new HashMap<>();
        //intially man lenge ki zero para hai kyoiki eg{1,-1}agar map me dekhenge to nhi ho ga zero
        mp.put(0,1);
        
        int cnt=0;
        for(int num:arr){
            psum+=num;
            if(mp.containsKey(psum-k)){
                cnt+=mp.get(psum-k);
            
            }
        
            mp.put(psum,mp.getOrDefault(psum,0)+1);
            
        }
        return cnt;
      
    }