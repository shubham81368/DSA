class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int n=dominoes.length;
        int arr[]=new int[100];
        for(int i=0;i<n;i++){
            int a=dominoes[i][0];
            int b=dominoes[i][1];
            if(a<b){
                int num=a*10+b;
                arr[num]++;
            }
            else{
                int num=b*10+a;
                arr[num]++;
            }
        }

        int cnt=0;
        for(int i=0;i<100;i++){
            if(arr[i]>1){
                int num=arr[i];
                cnt+=(num*(num-1))/2;
            }
        }
        return cnt;
    }
}