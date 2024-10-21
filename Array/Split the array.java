class Solution {

    public static int countgroup(int arr[]) {
        // Complete the function
            int n=arr.length;
        int xor=0;
        for(int i:arr){
            xor^=i;
        }
        if(xor!=0)return 0;
        return (1<<(n-1))-1;
    }
}
