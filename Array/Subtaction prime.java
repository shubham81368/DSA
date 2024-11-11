class Solution {
    boolean isprime[]=new boolean[1000];
    public boolean primeSubOperation(int[] nums) {
        int n=nums.length;
//t.c=o(n*maxsize)
        sieve();
       //checking start from second last element
        for(int i=n-2;i>=0;i--){//o(n)
            if(nums[i]<nums[i+1])continue;//continue
            //means nums[i]>=nums[i+1]
                //ham kame se kam prime minus karenge taki ye apne aage wale se chota ho jaye
                
                for(int p=2;p<nums[i];p++){//o(maxnum )
                if(isprime[p]==false)continue;
                
                    //agar prime hai to subtrack kar ke check karenge ki vo apen aage walo se chota hai ya nhi
                    if((nums[i]-p)<nums[i+1]){
                        nums[i]-=p;
                        break;
                    }
                
                }
                
            
            if(nums[i]>=nums[i+1])return false;
        }
        return true;
    }


    void sieve(){//o(og(log1000)) means o(1)
        Arrays.fill(isprime,true);
        isprime[0]=false;
        isprime[1]=false;

        for(int i=2;i*i<1000;i++){
            
            if(isprime[i]==true){
                for(int j=i*i;j<1000;j+=i){
                    isprime[j]=false;
                }
            }
        }
    }
}