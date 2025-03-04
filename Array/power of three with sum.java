class Solution {
    public boolean checkPowersOfThree(int n) {
    //    int p=0;

    //    while((int)Math.pow(3,p)<=n){
    //     p++;
    //    }

    //    while(n>0){
    //     if(n>=(int)Math.pow(3,p)){
    //         n=n-(int)Math.pow(3,p);
    //     }
    //     if(n>=(int)Math.pow(3,p))return false;
    //     p--;
    //    }
    //    return true;


    while(n>0){
        if(n%3==2)return false;//beacus 2 time same no. nhi lena
        n=n/3;
    }
    return true;
    }

}