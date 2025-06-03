class Solution {
    int countSubstr(String s, int k) {
        // your code here
               return countAtMostK(s,k)-countAtMostK(s,k-1);
    }
    
    int countAtMostK(String s,int k){
                int cnt=0;
        int i=0;
        int j=0;
        HashMap<Character,Integer>mp=new HashMap<>();
        int n=s.length();
        while(j<n){
            char c=s.charAt(j);
        
              mp.put(c,mp.getOrDefault(c,0)+1);
         
              while(mp.size()>k){
                char ch=s.charAt(i);
                mp.put(ch,mp.get(ch)-1);
                if(mp.get(ch)==0)mp.remove(ch);
                i++;
            }
              
              cnt+=j-i+1;
              
          
            j++;
        }
        return cnt;
    }
}