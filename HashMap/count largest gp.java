class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int num=1;num<=n;num++){
           int sum=digitSum(num);
           mp.put(sum,mp.getOrDefault(sum,0)+1);
           max=Math.max(max,mp.get(sum));
        }

    
        int s=0;
        for(int sum:mp.keySet()){
            if(mp.get(sum)==max){
                s++;
            }
        }
        return s;
    }

    int digitSum(int num){
        int cnt=0;
        while(num>0){
            cnt+=(num%10);
            num=num/10;
        }
        return cnt;
    }
}