class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
        }

        for(int i=0;i<n;i++){
            if(mp.get(s.charAt(i))==1)return i;
        }
        return -1;
    }
}