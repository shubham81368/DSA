class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums){
            pq.add(num);
        }
        long sum=0;
        while(k!=0){
            int maxNo=pq.poll();
            sum+=maxNo;
            int maxE1=(int)(Math.ceil(maxNo/3.0));
            pq.add(maxE1);
            k--;
        }
        return sum;
    }
}