class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        int n=arr.length;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i+1<n && arr[i]==arr[i+1]){
                ans.add(arr[i]*2);
                ans.add(0);
                i++;
            }
            else{
                ans.add(arr[i]);
            }
        }
        
        //now swap 
        int i=0,j=0;
        while(j<n){
            while(i<n && ans.get(i)!=0)i++;
             j=Math.max(j,i);
             while(j<n && ans.get(j)==0)j++;
            
             if(i==n || j==n)break;
             
             ans.set(i,ans.get(j));
             ans.set(j,0);
        }
        return ans;
    }