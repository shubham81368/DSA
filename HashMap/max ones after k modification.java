import java.util.*;

class Accio {
    public int longestOnes(int[] A, int B) {
          //Your code goes here
          int n=A.length;
          int l=0,r=0;
          int maxlen=0;
          int zero=0;
          while(r<n){
            if(A[r]==0)zero++;
            //shrink
            while(zero>B){
                if(A[l]==0)zero--;
                l++;
            }

            if(zero<=B){
                maxlen=Math.max(maxlen,r-l+1);

            }
            r++;
          }

          return maxlen;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
    	for(int i=0;i<N;i++)
	    A[i] = sc.nextInt();
        int B = sc.nextInt();
        Accio Obj = new Accio();
        System.out.println(Obj.longestOnes(A, B));
    }
}