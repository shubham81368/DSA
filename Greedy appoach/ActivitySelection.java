class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here.
        int n=start.length;
        List<Pair>li=new ArrayList<>();
        for(int i=0;i<n;i++){
            li.add(new Pair(start[i],finish[i]));
        }
        li.sort((a,b)->(a.second-b.second));
        int lastFinishTime=-1;
        int cnt=0;
        for(Pair p:li){
            if(p.first>lastFinishTime){
                lastFinishTime=p.second;
                cnt++;
            }
        }
        return cnt;
    }
    
   
}
 class Pair{
        int first;
        int second;
        Pair(int n1,int n2){
            first=n1;
            second=n2;
        }
    }