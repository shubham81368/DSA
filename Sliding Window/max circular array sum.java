   public int circularSubarraySum(int arr[]) {

        // Your code here
        //max sum either max_subarray sum or total -min_subarray_sum
        
        int curr_max=0,curr_min=0;
        int ans_max=Integer.MIN_VALUE;
        int ans_min=Integer.MAX_VALUE;
        int total=0;
        for(int i:arr){
            total+=i;//means curr number add ho rha hai
            //max subarray_sum
            curr_max=Math.max(curr_max+i,i);
            ans_max=Math.max(curr_max,ans_max);
            
            //min subarray sum
            curr_min=Math.min(curr_min+i,i);
            ans_min=Math.min(curr_min,ans_min);
        }
        
        return Math.max(ans_max,total-ans_min);
    }
}