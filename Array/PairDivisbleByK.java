class Solution {
    //t.c=o(n+k/2);
    //sc.=o(n)
    public boolean canArrange(int[] arr, int k) {
        int n=arr.length;
        int map[]=new int[k];//ye count store karga each no.%k
        for(int element:arr){
            int rem=((element%k)+k)%k;//ye negative ko bhi cover  kar lega
            map[rem]++;
        }
        //we check for zero separatly because complement of zero is itself
        if(map[0]%2!=0)return false;//agar odd hai to means 3 element hai jska modulo 0 hai par even hona chaiye

        //check for half remainder because half come in its complementary start from 1
        for(int rem=1;rem<=k/2;rem++){
            int comp=k-rem;
            if(map[rem]!=map[comp])return false;
        }

        return true;
       
    }
}