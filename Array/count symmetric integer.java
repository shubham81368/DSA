class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt=0;
        for(int i=low;i<=high;i++){
        
                String s=""+i;
                int n=s.length();
                if(n%2==1)continue;
                String first=s.substring(0,(n/2));
                String last=s.substring(n/2);
            
                if(check(first,last,n/2)){
                    cnt++;
                }
        
        }
        return cnt;
    }

    boolean check(String s1,String s2,int n){
          int n1=0;
          int i=0;
          while(i<n){
            n1+=(s1.charAt(i)-'0');
            i++;
          }

          i=0;
          int n2=0;
          while(i<n){
            n2+=(s2.charAt(i)-'0');
            i++;
          }

          return n1==n2;
    }
}