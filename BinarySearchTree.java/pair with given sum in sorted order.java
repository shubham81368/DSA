
    int countPairs(int arr[], int target) {
        // Complete the function
        int n=arr.length;
        int s=0;
        int e=n-1;
        int cnt=0;
        while(s<e){
            int sum=arr[s]+arr[e];
            if(sum<target){
                s++;
            }
            else if(sum>target){
                e--;
            }
            else {
                cnt++;
                int temp=s+1;
                while(temp<e && arr[temp]==arr[temp-1]){
                    cnt++;
                    temp++;}
                e--;
            }
        }
        return cnt;
    }