class Solution {

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int max=Integer.MIN_VALUE;
        int n=deadline.length;
        for(int i=0;i<n;i++){
            max=Math.max(max,deadline[i]);
        }
        int cnt=0;
        int maxProfit=0;
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int i=0;i<n;i++){
            pq.add(new int[]{deadline[i],profit[i]});
        }
        
        int ans[]=new int[max+1];
        for(int i=0;i<n;i++){
            int[] job=pq.poll();
            int d=job[0];
            int p=job[1];
           
            while(d>0 && ans[d]==1){
                d--;
            
            }
                if(d>0){
                    ans[d]=1;
                    maxProfit+=p;
                    cnt++;
                }
            
        }
        ArrayList<Integer>res=new ArrayList<>();
        res.add(cnt);
        res.add(maxProfit);
        return res;
    }
}