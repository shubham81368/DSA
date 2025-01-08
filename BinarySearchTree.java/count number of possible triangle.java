static int countTriangles(int arr[]) {
        // code here
        int n=arr.length;
        int cnt=0;
        Arrays.sort(arr);
        for(int i=n-1;i>=0;i--){
            int l=0;
            int r=i-1;
            while(l<r){
                int sum=arr[l]+arr[r];
                if(sum>arr[i]){
                    cnt+=r-l;
                    r--;
                }
                else{
                    l++;
                }
                
            }
        }
        return cnt;
    }