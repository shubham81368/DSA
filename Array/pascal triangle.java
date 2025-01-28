import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void solve(int A) {
        
        //your code here
      List<List<Integer>>ans=new ArrayList<>();
      for(int i=0;i<A;i++){
        List<Integer>row=new ArrayList<>(i+1);
        for(int j=0;j<i+1;j++){
          if(j==0 || j==i){
            row.add(1);
          }
          else{
            int num=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
            row.add(num);
          }
        }
        ans.add(row);
      }
        for(int i=0;i<A;i++){
          for(int j=0;j<i+1;j++){
            System.out.print(ans.get(i).get(j)+" ");
          }
          System.out.println();
        }
      
    }
  public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
	  int K = sc.nextInt();
      solve(K);
      
	}
}