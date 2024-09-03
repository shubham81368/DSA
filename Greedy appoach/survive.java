import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int d = sc.nextInt();
        boolean ans = Solution.isPossibleToSurvive(n, x, d);
        if(ans) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
class Solution {
    
    static boolean isPossibleToSurvive(int n, int x, int d )
    {
        // Your code here
        if(x>n){
            return false;
        }
        int sunday=d/7;
        int remainingDay=d-sunday;
        int foodRqforDdays=x*d;
        int daysNeed=foodRqforDdays/n;
        if(foodRqforDdays%n!=0)daysNeed++;
        if(daysNeed<=remainingDay){
            return true;
        }
        return false;
    }  
}
