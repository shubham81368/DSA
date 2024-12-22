class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int n=mat.length;
        
        for(int i=0;i<n;i++){
            if(mat[i][0]<=x && x<=mat[i][mat[0].length-1]){
                if(find(mat[i],x))return true;
            }
        }
        return false;
        
    }
    
    
    public static boolean find(int[] arr,int x){
        int l=0;
        int n=arr.length;
        int r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==x){
                return true;
            }
            else if(arr[mid]<x){
                l=mid+1;
            }
            else if(arr[mid]>x){
                r=mid-1;
            }
        }
        return false;
    }
}