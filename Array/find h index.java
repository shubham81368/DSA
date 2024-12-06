class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        // code here
        int n=citations.length;
        int freq[]=new int[n+1];
        for(int i=0;i<n;i++){
            if(citations[i]>=n)freq[n]++;
            else{
                freq[citations[i]]++;
            }
        }
        
        int hindex=n;
        int num=freq[n];
        while(num<hindex){
            hindex--;
            num+=freq[hindex];
        }
        return hindex;
    }
}