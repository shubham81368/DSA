   ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
               
        int n = arr.length;
        int i = 0;  // Left pointer of the window
        int j = 0;  // Right pointer of the window
        
        // A HashSet to keep track of distinct elements in the current window.
        HashMap<Integer,Integer>mp=new HashMap<>();
        
        // Traverse through the array with the right pointer `j`.
        while (j < n) {
            // Add the current element to the set.
            mp.put(arr[j],mp.getOrDefault(arr[j],0)+1);
            
            // Check if the window size is exactly k.
            if (j - i + 1 == k) {
                // Add the number of distinct elements in the window to the result list.
                ans.add(mp.size());
                
                // Remove the left-most element from the set as the window slides forward.
                if(mp.get(arr[i])>1){
                    mp.put(arr[i],mp.getOrDefault(arr[i],0)-1);
                }
                else{
                mp.remove(arr[i]);
                }
                
                // Increment the left pointer to slide the window.
                i++;
            }
            
            // Move the right pointer forward to expand the window.
            j++;
        }
        
        return ans;

    }