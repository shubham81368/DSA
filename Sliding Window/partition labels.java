class Solution {
    public List<Integer> partitionLabels(String s) {
        int n=s.length();
        int ans[]=new int[26];
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans[s.charAt(i)-'a']=i;
        }
        
        int i=0;
        while(i<n){
            int end=ans[s.charAt(i)-'a'];
            int j=i;
            while(j<end){
                end=Math.max(end,ans[s.charAt(j)-'a']);
                j++;
            }
            res.add(j-i+1);
            i=j+1;
        }
          return res;
    }
}