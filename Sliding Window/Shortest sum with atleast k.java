class Solution {
    public int shortestSubarray(int[] nums, int k) {
          int n=nums.length;
          //hamm dq ka use karenge incerasing order me sum ka index store karne ke liye
          Deque<Integer>dq=new LinkedList<>();
          int j=0;
          int result=Integer.MAX_VALUE;
          long[] psum=new long[n];

          while(j<n){
            if(j==0){
                psum[j]=nums[j];
            }
            else{
                psum[j]=psum[j-1]+nums[j];
            }

            if(psum[j]>=k){
                result=Math.min(result,j+1);
            }

            while(!dq.isEmpty() && psum[j]-psum[dq.peekFirst()]>=k){
                result=Math.min(result,j-dq.peekFirst());
                dq.pollFirst();
            }
            //agar queue me jo element usse psum less hai to q se remove karenge saare element
            while(!dq.isEmpty()&& psum[j]<=psum[dq.peekLast()]){
                dq.pollLast();
            }

            dq.addLast(j);

            j++;
          }

          return result==Integer.MAX_VALUE?-1:result;
    }
}