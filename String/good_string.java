import java.util.*;

public class Main {

  static int goodStrings(String s, String[] A, int n) {
    // your code here
    int cnt=0;
    int[] c=new int[26];
    for(int i=0;i<s.length();i++){
      c[s.charAt(i)-'a']=1;
    }
    for(int i=0;i<n;i++){
      int j=0;
      boolean flag=false;
      while(j<A[i].length()){
            if(c[A[i].charAt(j)-'a']!=1){
              
              flag=true;
              break;
            }
            j++;
      }
      if(flag==false)cnt++;
    }
    return cnt;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      int n = sc.nextInt();
      String[] A = new String[n];
      for (int i = 0; i < n; i++) {
        A[i] = sc.next();
      }

      System.out.println(goodStrings(s, A, n));
    }
  }
}