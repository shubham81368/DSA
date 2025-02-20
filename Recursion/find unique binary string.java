class Solution {
    StringBuilder sb;
    public String findDifferentBinaryString(String[] nums) {
        HashSet<String>set=new HashSet<>();
        for(String num:nums){
            set.add(num);
        }
        sb=new StringBuilder();
        helper(nums,nums.length,sb,set);
        return sb.toString();
    }

    boolean helper(String[] nums,int n,StringBuilder sb,HashSet<String>set){
        if(sb.length()==n){
            if(!set.contains(sb.toString())){
                return true;
            }
            return false;
        }

        for(char ch='0';ch<='1';ch++){
            sb.append(ch);
           if(helper(nums,n,sb,set))return true;
           sb.deleteCharAt(sb.length()-1);
        }
        return false;
    }
}