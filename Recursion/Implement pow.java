//t.c->o(loge);
class Solution {
    double power(double b, int e) {
        // code here
        if(e==0)return 1;
        if(e==1)return b;
        if(e<0)return 1/power(b,-e);
        if(e%2==0)return power(b*b,e/2);
        return b*power(b,e-1);
    }
}