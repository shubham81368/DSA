//time complexity=O(n)
//space complexity=o(n)
class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        Map<Integer,Integer>map=new HashMap<>();
        int maxDis=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])==false){
                map.put(arr[i],i);
            }
            else{
                maxDis=Math.max(maxDis,i-map.get(arr[i]));
            }
        }
        return maxDis;
    }
}