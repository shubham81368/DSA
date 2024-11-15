class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        //find jth pointer from right side
        while(j>0 && arr[j]>=arr[j-1]){
            j--;
        }
        //agar hamara array pahele se he incrasing order me sorted hai
        
        // if(i==j)return 0;
        int delete=j;//we are removing all element left to index j because index j to n-1 is sorted

       //start finding correct i and j and deleted element=j-i-i;
        while(i<j && (i==0 || arr[i]>=arr[i-1])){//incerasing order of element from i
            
            while( j<n &&arr[i]>arr[j]){
                j++;
            }
            //min element should be deleted
            delete=Math.min(delete,j-i-1);
            i++;

        }
        return delete;
    }
}