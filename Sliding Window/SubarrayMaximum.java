class Solution {
    // Function to find maximum of each subarray of size k.
    
    //s.c=O(k)
    //T.c=o(n)
    public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
        // Your code here
        int n=arr.length;
        ArrayList<Integer>ans=new ArrayList<>();
        Deque<Integer>dq=new ArrayDeque<>();
        for(int i=0;i<k;i++){//this work for first window
            while(!dq.isEmpty() && arr[dq.peekLast()] <=arr[i]){
                dq.removeLast();
            }
         dq.addLast(i);//here 
        }
        ans.add(arr[dq.peekFirst()]);
        
        //for rest window
        for(int i=k;i<n;i++){
            //remove if curr window out of window element
            if(dq.peekFirst()<=i-k){
                dq.removeFirst();
            }
            
            //include current element
            // in dec. order
            while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            ans.add(arr[dq.peekFirst()]);
        }
        return ans;
    }
}