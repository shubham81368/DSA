class Solution {
    public int findSubString(String str) {
        // code here
        int n=str.length();
        Set<Character>s=new HashSet<>();
        for(char c:str.toCharArray()){
            s.add(c);
        }
        int j=0;
        int i=0;
        HashMap<Character,Integer>mp=new HashMap<>();
        int len=Integer.MAX_VALUE;
        while(j<n){
            mp.put(str.charAt(j),mp.getOrDefault(str.charAt(j),0)+1);
            if(mp.size()>=s.size()){
            while(mp.get(str.charAt(i))>1){
                mp.put(str.charAt(i),mp.get(str.charAt(i))-1);
                if(mp.get(str.charAt(i))==0)mp.remove(str.charAt(i));
                i++;
            }
            len=Math.min(len,j-i+1);
            }
            j++;
        }
        return len;
    }
}