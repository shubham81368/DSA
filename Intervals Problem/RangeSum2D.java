import java.util.*;

class Pair {
    int row1;
    int row2;
    int col1;
    int col2;
}

class Solution {

    public List<Integer> solve(int mat[][], Pair query[]) {
        // Your code here
       //first make 2 d prefix matrix
       int r=mat.length;
       int c=mat[0].length;
        int[][] pr=new int[r][c];
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int v1=0;//upper rectangle
                if(i-1>=0)v1=pr[i-1][j];

                int v2=0;//left  rectangle
                if(j-1>=0)v2=pr[i][j-1];

                int v3=0;//corner rectangle
                if(i-1>=0 && j-1>=0){
                    v3=pr[i-1][j-1];
                }
                //curr index ke liye prefix sum
                pr[i][j]=mat[i][j]+v1+v2-v3;
        }
        }

        List<Integer>ans=new ArrayList<>();
        //now calculate sum for each query
        for(Pair p:query){
            int r1=p.row1;
            int r2=p.row2;
            int c1=p.col1;
            int c2=p.col2;
            
            int v1=0;//upper
            if(r1-1>=0)v1=pr[r1-1][c2];

            int v2=0;//left
            if(c1-1>=0)v2=pr[r2][c1-1];

            int v3=0;//corner
            if(r1-1>=0 && c1-1>=0)v3=pr[r1-1][c1-1];

            ans.add(pr[r2][c2]-v1-v2+v3);
        }
        return ans;
    }
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            matrix[i][j]=sc.nextInt();
        }
        int q = sc.nextInt();
        Pair query[] = new Pair[q];

        Solution obj = new Solution();
        for (int i = 0; i < q; i++) {
            Pair p=new Pair();
            p.row1 = sc.nextInt();
            p.col1 = sc.nextInt();
            p.row2 = sc.nextInt();
            p.col2 = sc.nextInt();
            query[i]=p;
        }
        List<Integer> ans = obj.solve(matrix, query);
        for(int x: ans)
        System.out.println(x);
        sc.close();
    }
}