class Solution {
    int totalCount(int k, int[] arr) {
        // code here
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(num==0)cnt++;//agar no zero hai to ek baar count hoga
            if(num!=k){
            while(num!=0){
                num-=k;
                cnt++;
                if(num<0){
                    break;
                }
                
            }
                 
            }
            else{
                //agar num==k
                cnt++;
            }
         
            
        }
        return cnt++;
    }
}