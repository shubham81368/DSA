class Pair implements Comparable<Pair>{
    int num;
    int idx;
    Pair(int num,int idx){
        this.num=num;
        this.idx=idx;
    }
    
    public int compareTo(Pair other){
        return Integer.compare(this.num,other.num);
    }
    
}
class Solution {

    public ArrayList<Integer> longestSubarray(int[] arr, int x) {
        // code here
        PriorityQueue<Pair>min=new PriorityQueue<>();
        PriorityQueue<Pair>max=new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        int j=0;
        int n=arr.length;
        int maxLen=0;
        int i1=i;
        int i2=j;
    
    
    while(j<n){
        min.offer(new Pair(arr[j],j));
        max.offer(new Pair(arr[j],j));
        while((int)Math.abs(min.peek().num-max.peek().num)>x){
            
            i=Math.min(min.peek().idx,max.peek().idx)+1;
            while(min.peek().idx<i){min.poll();}
            while(max.peek().idx<i){max.poll();}
        }
        if(maxLen<j-i+1){
            maxLen=j-i+1;
            i1=i;
            i2=j;
        }
        j++;
    }
    ArrayList<Integer>ans=new ArrayList<>();
    for(int k=i1;k<=i2;k++){
        ans.add(arr[k]);
    }
    return ans;
}
}