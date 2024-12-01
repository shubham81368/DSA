import java.util.*;

public class Main {

    public static long DistinctCharacterSubstring(String s){
        //write code here
        int n=s.length();
        long cnt=0;
        HashSet<Character>window=new HashSet<>();
        int start=0;
        for(int end=0;end<n;end++){
            while(window.contains(s.charAt(end))){
                window.remove(s.charAt(start));
                start++;
            }
            window.add(s.charAt(end));
            cnt+=(end-start+1);
        }
        return cnt;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long ans = DistinctCharacterSubstring(s);
        System.out.println(ans);
    }
}
