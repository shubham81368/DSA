class Solution {
    int maxCount=0;
    public int maxUniqueSplit(String s) {
        
        maxCount=0;
        HashSet<String>set=new HashSet<>();
        helper(s,set,0);
        return maxCount;
    }
    
    void helper(String s,HashSet<String>set,int i){
        int n=s.length();
        if(i==n){
            maxCount=Math.max(maxCount,set.size());
            return ;
        }

        for(int j=i;j<n;j++){
            String sub=s.substring(i,j+1);
                  if(!set.contains(sub)){
                set.add(sub);
                helper(s,set,j+1);
                set.remove(sub);
            }
        }
    }  
}