import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        StringBuilder str=new StringBuilder(input.nextLine());
        
        solve(str,n);

        input.close();
    }
	
    public static void solve(StringBuilder str,int n){
        // WRITE YOUR CODE HERE
        boolean isUsed[] =new boolean[n+1];
        int cnt=0;
        for(int len=1;len<=n;len++){
            for(int j=0;j<=n-len;j++){
                long num=Long.parseLong(str.substring(j,j+len));
                if(checkIsAj(num)&& isAlreadyUsed(j,j+len,isUsed)){
                    cnt++;
                
                for(int k=j;k<j+len;k++)isUsed[k]=true;
                }
            }
        }
        System.out.print(cnt);

    }

    static  boolean isAlreadyUsed(int i,int j,boolean isUsed[]){
        for(int k=i;k<j;k++){
            if(isUsed[k]==true)return false;
        }
        return true;
    }

    static boolean checkIsAj(long n){
        if(n==0 || n==1)return false;

        int[] AJ={2,3,5,7,11,13,17,19,23,29};

        for(int i=0;i<AJ.length;i++){
            if(AJ[i]==n)return true;
        }

        for(int i=0;i<AJ.length;i++){
            if(n%AJ[i]==0)return false;
        }
        return true;
    }
}