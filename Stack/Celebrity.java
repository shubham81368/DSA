import java.io.*;
import java.util.*; 

class Main{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M[][] = new int[N][N];
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
                M[i][j] = sc.nextInt();
        System.out.println(new Solution().findCelebrity(M,N));
    } 
} 
class Solution
{ 
    int findCelebrity(int M[][], int n)
    {
       Stack<Integer>st=new Stack<>();
       for(int i=0;i<n;i++){
        st.push(i);
       }

       while(st.size()>1){//because ham do element ko nikalenge
             int p1=st.pop();//fist person
             int p2=st.pop();//second person
             if(M[p1][p2]==1){//p1 person p2 ko janta hai to p2 dubara push hota hai
                st.push(p2);
             }else{
                st.push(p1);;
             }
       }
       int possibleCele=st.peek();
        
        int row=possibleCele;
        //col me check karenge
        for(int j=0;j<n;j++){
            if(j!=row && M[row][j]==1){
                return -1;//mean ye bhi celebrity nhi ho sakta
            }
        }
          
        //ab row me bhi check karenge agar
        int col=possibleCele;
        for(int i=0;i<n;i++){
            if(i!=col&&M[i][col]==0){//agar uper ya niche 0 aa gya col me zero to vo cele nhi hai
                return -1;
            }
        }
        return possibleCele;
    }

}