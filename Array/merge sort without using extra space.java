
class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int i=a.length-1;
        int j=0;
        int m=b.length;
        
        while(i>=0&& j<m){
            if(a[i]<b[j]){
                break;
            }
            else{
                int temp=a[i];
                a[i]=b[j];
                b[j]=temp;
            }
            i--;j++;
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
    }
}