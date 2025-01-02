  public int lenOfLongestSubarr(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer>mp=new HashMap<>();
        int psum=0;
        int n=arr.length;
        int len=0;
        for(int i=0;i<n;i++){
            psum+=arr[i];
            if(psum==k){
                len=Math.max(len,i+1);
            }
            
            if(mp.containsKey(psum-k)){
                len=Math.max(len,i-mp.get(psum-k));
            }
            if(mp.containsKey(psum)){//yahan hamne continue kiya hai kyoiki index updata ho na paaye
            //eg{1,0,0,3)k==3 ouput=3
                continue;
            }
            mp.put(psum,i);
        }
        return len;
        
    }