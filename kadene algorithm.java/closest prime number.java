class Solution {
    public int[] closestPrimes(int left, int right) {

        boolean prime[]=new boolean[right+1];
        Arrays.fill(prime,true);

        for(int i=2;i*i<=right;i++){
            if(prime[i]){
                for(int j=i+i;j<=right;j+=i){
                    prime[j]=false;
                }
            }
        }
        int[] ans=new int[2];
           prime[1]=false;
        ans[0]=-1;
        ans[1]=-1;
        ArrayList<Integer>p=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(prime[i])p.add(i);
        }
       
       Collections.sort(p);
       if(p.size()<=1)return ans;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<p.size()-1;i++){
        if(min>((int)Math.abs(p.get(i)-p.get(i+1)))){
            min=(int)Math.abs(p.get(i)-p.get(i+1));
            ans[0]=p.get(i);
            ans[1]=p.get(i+1);
        }
       }
     
       return ans;
    }

    boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0)return false;
        }

        return true;
    }
}