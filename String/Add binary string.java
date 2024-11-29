   public String addBinary(String s1, String s2) {
        // code here
        int n=s1.length();
        int m=s2.length();
        if(n==0)return s2;
        if(m==0)return s1;
        
        int i=n-1;
        int j=m-1;
        int carry=0;
        StringBuilder ans=new StringBuilder();
        while(i>=0 || j>=0 ||carry>0){
            if(i>=0){
            carry+=s1.charAt(i)-'0';
            i--;
            }
            if(j>=0){
                carry+=s2.charAt(j)-'0';
                j--;
            }
            if(carry%2==1){
                ans.append("1");
            
            }
            else{
                ans.append("0");
            
            }
            
            carry/=2;//agar caary 2 ya usse se jada hoga tabgi remainser aayega agar 1 hai 0 aayega
            
        }
        
        ans.reverse();
        int k=0;
        while(k<ans.length() && ans.charAt(k)=='0'){
            k++;
        }
        if(k==ans.length())return "0";
      
        return ans.substring(k);
    }