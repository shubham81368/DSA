class Solution {
    public int minimumRecolors(String s, int k) {
        int min=Integer.MAX_VALUE;
        int n=s.length();
        int i=0;
        int j=0;
        int c1b=0;
        int c2w=0;
        while(j<n){
            if(s.charAt(j)=='B')c1b++;
            else c2w++;

            if(c1b+c2w==k){
                min=Math.min(min,c2w);
            }
            if(c1b+c2w>=k){
                if(s.charAt(i)=='W')c2w--;
                else c1b--;
                i++;
            }
            j++;
        }
        return min;
    }
}