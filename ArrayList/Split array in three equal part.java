class Solution {
    // Function to determine if array arr can be split into three equal sum sets.
    public List<Integer> findSplit(int[] arr) {
        // code here
        List<Integer>ans=new ArrayList<>();
        int n=arr.length;
        
        int total_sum=0;
        for(int num:arr){
            total_sum+=num;
        }
      
       int first=-1;
       int second=-1;
       int i=0;
       
       //first parition
       int curr=0;
        while(i<n){
            curr+=arr[i];
            if(curr*3==total_sum){
                first=i;
                i++;
                break;
            }
            else if(curr*3>total_sum){
                ans.add(-1);
                ans.add(-1);
                return ans;
            }
            else{
                i++;
            }
            
        }
        
        //second partition
        curr=0;
        while(i<n){
            curr+=arr[i];
            if(curr*3==total_sum){
                second=i;
                i++;
                break;
            }
            else if(curr*3>total_sum){
                ans.add(-1);
                ans.add(-1);
                return ans;
            }
            else{
                i++;
            }
        }
        
        //check for third partition;
        curr=0;
        while(i<n){
            curr+=arr[i];
            i++;
        }
            if(curr*3==total_sum){
                ans.add(first);
                ans.add(second);
                return ans;
            }
            
                ans.add(-1);
                ans.add(-1);
            
        return ans;
        
    }
}