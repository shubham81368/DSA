class Solution {
    public String removeOccurrences(String s, String part) {
        int n=s.length();
        int p=part.length();
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(s.charAt(i));
            if(sb.length()>=p){
                String str=sb.substring(sb.length()-p);
                if(str.equals(part)){
                    sb.setLength(sb.length()-p);
                }
            }
        }
            return sb.toString();
    }
}