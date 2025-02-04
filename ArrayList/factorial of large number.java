  public static ArrayList<Integer> factorial(int n) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        
        res.add(1);
        for(int multiplier=2;multiplier<=n;multiplier++){
               int carry=0;
               
               for(int i=0;i<res.size();i++){
                   int product=res.get(i)*multiplier+carry;
                   res.set(i,product%10);
                     carry=product/10;
               }
             
               
               while(carry!=0){
                   res.add(carry%10);
                   carry/=10;
               }
               
        }
        Collections.reverse(res);
        return res;
    }
    