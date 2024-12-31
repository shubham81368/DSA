  // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
       int n=arr.length;
       int maxele=-1;//isme hamne max ele store kayraya hai taki 1 lakh baar iterate na karn ho
       int freq[]=new int[100000+1];
       for(int i=0;i<n;i++){
           freq[arr[i]]=1;
           maxele=Math.max(maxele,arr[i]);
       }
       int cnt=0;
       int maxlen=1;
       for(int i=0;i<=maxele;i++){
           if(freq[i]==1){
               cnt++;
           }
           else{
               cnt=0;
           }
           maxlen=Math.max(maxlen,cnt);
           
       }
       return maxlen;
    }