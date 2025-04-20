class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int num:answers){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        int sum=0;
        for(int num:mp.keySet()){
           int cnt=mp.get(num);
           int groupSize=num+1;
           int groups=(cnt+groupSize-1)/groupSize;
           sum+=groups*groupSize;  
        }

       return sum;
    }
}