  int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int s=0;
        int e=arr.length-1;
        int cnt=0;
        while(s<e){
            int sum=arr[s]+arr[e];
            
            if(sum<target){
                
                cnt+=(e-s);
                s++;
            }
            else{
                 e--;
            }
        }
        return cnt;
    }