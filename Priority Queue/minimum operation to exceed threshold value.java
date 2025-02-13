class Solution {
    public int minOperations(int[] nums, int k) {
        int n=nums.length;
        PriorityQueue<Long>pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add((long)nums[i]);
        }
        int cnt=0;
        
        while(pq.size()>1 && pq.peek()<k){
            cnt++;
            long num1=pq.poll();
            long num2=pq.poll();
            long num=Math.min(num1,num2)*2+Math.max(num1,num2);
            pq.offer(num);
        }
        return cnt;
    }
}