class Solution {
    public static int sumSubstrings(String s) {
        // code here
    
        int n=s.length();
      
         int placevalue=1;
         int sum=0;
         for(int i=n-1;i>=0;i--){
             int digit=s.charAt(i)-'0';
             sum+=digit*(i+1)*placevalue;
             placevalue=placevalue*10+1;
         }
        return sum;
    }
}