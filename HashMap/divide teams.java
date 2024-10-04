class Solution {
    public long dividePlayers(int[] skill) {
        int n=skill.length;
        int  totalSum=0;
        for(int i=0;i<n;i++){
            totalSum+=skill[i];
        }
        int teams=n/2;
        if(totalSum%teams!=0)return -1;//means ham pair nhi bna sakte hai kyoki value me remiander aa rha hai
       
       int onePairSum=totalSum/teams;
       //check eack pair sum equal to onePairSum if any pair not equal to x or OnePairSum return -1;
       //we only store num as a key and uski frequency as a value
       Map<Integer,Integer>map=new HashMap<>();
       for(int num:skill){
          map.put(num,map.getOrDefault(num,0)+1);
       }

       //now check each pair equal to result or not
       long chemistry=0;
       for(int ele:skill){
        if(map.get(ele)==0)continue;//if freq of that no is zero means alerady take in pair
        map.put(ele,map.get(ele)-1);//iss no ka use ho gya isliye iski freq dec kar do
        int remaining=onePairSum-ele;
        if(!map.containsKey(remaining)||map.get(remaining)==0){
            return -1;
        }
          map.put(remaining,map.get(remaining)-1);
           chemistry=chemistry+((long)ele*(long)remaining);
       }
       return chemistry;
    }
}