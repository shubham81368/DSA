import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> ranges = new ArrayList<>();
        for(int i=0;i<n;i++) {
            ArrayList<Integer> range = new ArrayList<>();
            range.add(sc.nextInt());
            range.add(sc.nextInt());
            ranges.add(range);
        }
        ArrayList<ArrayList<Integer>> ans = Solution.mergeRanges(ranges);
        int m = ans.size();
        System.out.println(m);
        for(int i=0;i<m;i++) {
            System.out.println(ans.get(i).get(0) + " " + ans.get(i).get(1));
        }
    }
}

class Solution
{
    static ArrayList<ArrayList<Integer>> mergeRanges(ArrayList<ArrayList<Integer>> ranges) 
    {
       // your code here
       ArrayList<ArrayList<Integer>>res=new ArrayList<>();
       int n=ranges.size();

     
       //sort on the basis of starting point
       Collections.sort(ranges,(a,b)->(a.get(0)==b.get(0)?a.get(1)-b.get(1):a.get(0)-b.get(0)));
         int start=ranges.get(0).get(0);
       int end=ranges.get(0).get(1);
       for(int i=1;i<n;i++){

           if(end>=ranges.get(i).get(0)){
            
            end=Math.max(end,ranges.get(i).get(1));
           }
           else{
            res.add(new ArrayList<>(Arrays.asList(start,end)));
            start=ranges.get(i).get(0);
            end=ranges.get(i).get(1);
           }
        
       }
       res.add(new ArrayList<>(Arrays.asList(start,end)));
       return res;
    }

}