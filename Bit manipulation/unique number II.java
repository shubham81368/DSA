class Solution {
    public int[] singleNum(int[] arr) {
        // Code here
        int xor_all=0;
         for(int num:arr){
             xor_all^=num;
         }
         
         //agar right most set bit nikalna hai us no. ke negative se and kar do
         int setbit=xor_all&-xor_all;
         
         int a1=0,a0=0;
         for(int num:arr){
             if((num&setbit)!=0){
                 a1^=num;
             }
             else{
                 a0^=num;
             }
         }
         
         if(a0<a1)return new int[]{a0,a1};
         return new int[]{a1,a0};
    }
}