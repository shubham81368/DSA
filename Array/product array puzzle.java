    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n=arr.length;
        int[] ans=new int[n];
        
        //pahele right sife se fill karenge or khud wale ko nhi lenge
        int right=1;
    
        for(int i=n-1;i>=0;i--){
            ans[i]=right;
            right*=arr[i];
        }
     //ab left side se karenge khud wale ko nhi lenge
     int left=1;
     for(int i=0;i<n;i++){
         ans[i]*=left;
         left*=arr[i];
     }
        
      
        return ans;
    }