class Solution {
    public String largestNumber(int[] nums) {
        String arr[] =new String[nums.length];
        //converting int array to string array
        for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]);
        }
        //now we sort the array by taking two number
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        if(arr[0].equals("0"))return "0";
        
       String s="";
       for(int i=0;i<arr.length;i++){
        s+=arr[i];
       }
       return s;
    }
}