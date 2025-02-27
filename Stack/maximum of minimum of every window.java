   public ArrayList<Integer> maxOfMins(int[] arr) {
        // Your code here
        int n=arr.length;
        
        int[] nsl=nsLeft(arr,n);
        int[] nsr=nsRight(arr,n);
        
        ArrayList<Integer>ans=new ArrayList<>(n);
        
        for(int i=0;i<n;i++){
            ans.add(0);
        }
        
        for(int i=0;i<n;i++){
            int idx=nsr[i]-nsl[i]-1;
            int max=Math.max(ans.get(idx-1),arr[i]);
            ans.set(idx-1,max);
        }
        for(int i=n-2;i>=0;i--){
            int max=Math.max(ans.get(i+1),ans.get(i));
            ans.set(i,max);
        }
        return ans;
    }
    
    int[] nsLeft(int[] arr,int n){
        int ans[]=new int[n];
        ans[0]=-1;
        Stack<Integer>st=new Stack<>();
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty())ans[i]=-1;
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    
    int[] nsRight(int arr[],int n){
        int ans[]=new int[n];
        ans[n-1]=n;
        Stack<Integer>st=new Stack<>();
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty())ans[i]=n;
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }