class Solution {
    public boolean isArraySpecial(int[] num) {
        // int n=num.length;
        // if(n==1)return true;

        // for(int i=1;i<n;i++){
        //     if(num[i-1]%2==0 && num[i]%2==0)return false;
        //     if(num[i-1]%2==1 && num[i]%2==1)return false;
        // }

        // return true;
        

        int n=num.length;
        if(n==1)return true;

        for(int i=1;i<n;i++){
            //we checking first bit only
            if((num[i-1]&1) ==(num[i]&1))return false;
            
        }
        return true;
    }
}