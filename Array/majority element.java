class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n=nums.length;
        Arrays.sort(nums);
        List<Integer>ans=new ArrayList<>();
       
       //THERE ATMOST TWO NUMBER WHOSE FREQ GREATER THEN N/3;
       
       //WE MORRIS ALGORITHM
       
       int max=Integer.MAX_VALUE;
       int a=max,b=max;
       int c1=0,c2=0;
       
       for(int num:nums){
           if(a==num){
               c1++;
           }
           else if(b==num){
              c2++;
           }
           else if(c1==0){
               a=num;
               c1=1;
           }
           else if(c2==0){
               b=num;
               c2=1;
           }
           else{
               c1--;
               c2--;
           }
       }
       
       c1=0;
       c2=0;
       
       for(int num:nums){
           if(a==num){
               c1++;
           }
           else if(b==num){
               c2++;
           }
       }
       
       if(c1>n/3)ans.add(a);
       if(c2>n/3)ans.add(b);
       
       
       return ans;
    }
}