class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n=s.length();
        int j=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            
            if(j<spaces.length && i==spaces[j]){
                sb.append(" ");
                j++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}