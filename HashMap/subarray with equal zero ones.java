 public int maxLen(int[] arr) {
        // Your code here
        int n=arr.length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        int maxLen=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=(arr[i]==0)?sum-1:sum+1;
            if(sum==0){
                maxLen=Math.max(maxLen,i+1);
            }
            if(mp.containsKey(sum)){
                maxLen=Math.max(maxLen,i-mp.get(sum));
            }
            if(mp.containsKey(sum)){
                continue;
            }
            mp.put(sum,i);
        }
        
        return maxLen;
    }