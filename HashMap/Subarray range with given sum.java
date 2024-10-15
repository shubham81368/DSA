class Solution {
    // Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int tar) {
        // add your code here
        int cnt=0;
        int n=arr.length;
        int sum=0;
       HashMap<Integer,Integer>map=new HashMap<>();
       map.put(0,1);//we have to check for zero we put 1 freq separately
       for(int i=0;i<n;i++){
            sum+=arr[i];
           if(map.containsKey(sum-tar)){
               cnt+=map.get(sum-tar);
           }
             
           map.put(sum,map.getOrDefault(sum,0)+1);
       }
        return cnt;
    }
}