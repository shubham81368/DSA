{
        // code here
        int totalsum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            totalsum+=arr[i];
        }
        
        int psum=0;
        for(int i=0;i<n;i++){
            int leftsum=psum;
            int rightsum=totalsum-psum-arr[i];
            if(leftsum==rightsum){
                return i;
            }
            psum+=arr[i];
        }
        return -1;
    }