class Solution {
    public long minimumSteps(String s) {
        int lastzero=0;
        long swapCnt=0;
        for(int cur=0;cur<s.length();cur++){
            if(s.charAt(cur)=='0'){
                //apko zero mila hai to swap hoga lastzero ki postion 1 plus hoga
                
                swapCnt+=(cur-lastzero);//imaginary swapping
                lastzero++;
            }

            //agar 1 milega to skip kar denge
        }
        return swapCnt;
    }
}