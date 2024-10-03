class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        // Your code goes here.
        ArrayList<Integer>ans=new ArrayList<>();
        int n=nums.size();
        
        
        //apply morris voting alg. by taking two candidate
        
        int a=Integer.MIN_VALUE;//initailly both value contain default value
        int b=a;//second candidate
        int c1=0;//first candidate frequency
        int c2=0;//second candidate frequency
        for(int ele:nums){
            if(ele==a){//if ele equal to first cnadidate inc the count c1;
                c1++;
            }
           else if(ele==b){
                c2++;
            }
            else if(c1==0){
                a=ele;
                c1=1;
            }
            else if(c2==0){
                b=ele;
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
            
        }
        
       //make count value zero for both candidate
       c1=0;
       c2=0;
        
        for(int ele:nums){
            if(ele==a)c1++;
            else if(ele==b)c2++;
        }
        
         if(c1>n/3){
            ans.add(a);
        }
        
         if(c2>n/3){
            ans.add(b);
        }
       
       
        if(ans.size()==0){
            ans.add(-1);
        }
        return ans;
    }
}
