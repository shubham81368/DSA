class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<banned.length;i++){
            set.add(banned[i]);
        }
        int cnt=0;
        int sum=0;
        for(int num=1;num<=n;num++){
             if(set.contains(num)){
                continue;
             }

             if(sum+num<=maxSum){
                cnt++;
                sum+=num;
             }
             else{
                break;
             }
        }

        return cnt;
    }
}