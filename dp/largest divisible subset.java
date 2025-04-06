class Solution {
    int n;
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        n=nums.length;
        List<Integer>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        helper(nums,0,temp,ans,-1);
        return ans;
    }

    public void helper(int[] nums,int i,List<Integer>temp,List<Integer>ans,int prevEle){
        if(i==n){
            if(temp.size()>ans.size()){
                ans.clear();//it clear the prev result
                ans.addAll(temp);//add all function add all element of temp
            }
            return ;
        }
        //take
        if(prevEle==-1 || nums[i]%prevEle==0){
            temp.add(nums[i]);
            helper(nums,i+1,temp,ans,nums[i]);
            //ab remove kardenge element ko taaki not take me cosider na ho;
            temp.remove(temp.size()-1);//ye index ki value ko remove karta hai
        }

        //not take
        helper(nums,i+1,temp,ans,prevEle);//nhi liya to prev wahi element rhega;
    }
}