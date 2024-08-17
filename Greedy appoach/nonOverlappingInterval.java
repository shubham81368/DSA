import java.util.*;

class Solution {
    public static int solve(List<List<Integer>> A) {
    // Write your code here
    //sort array of A according to the finsih point of the interval mean second value of interval
    //a.get(1)-b.get(1)
    //if a[1]==b[1] sort according first value
    Collections.sort(A,(a,b)->( (a.get(1)<b.get(1))? (a.get(1)-b.get(1)) : (a.get(0)-b.get(0))));
    int ct=0,endTime=0;
    for(int i=0;i<A.size();i++){
        if(A.get(i).get(0)>endTime){
            ct++;
            endTime=A.get(i).get(1);
        }
    }
    return ct;
	}
}
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> A = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            List<Integer> interval = Arrays.asList(a, b);
            A.add(interval);
        }
        int ans = Solution.solve(A);
        System.out.println(ans);
    }
}
