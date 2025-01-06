 public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        int n=arr.length;
        List<Integer>ans=new ArrayList<>();
        int i=0;int j=n-1;
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(Math.abs(target-sum)<minDiff){
                ans=Arrays.asList(arr[i],arr[j]);
                minDiff=Math.abs(target-sum);
            }
            

            if(target>sum){
                i++;
            }
            else if(target<sum){
                j--;
            }
            else{
                return ans;
            }
        }
        return ans;
    }