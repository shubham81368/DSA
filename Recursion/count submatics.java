class Solution {

    public int solve(int i,int j,int[][] mat,int t[][]){
        if(i>=mat.length || j>=mat[0].length)return 0;

        if(mat[i][j]==0)return 0;

        if(t[i][j]!=-1)return t[i][j];

        //right
      int r=  solve(i,j+1,mat,t);
      //dig
      int d=solve(i+1,j+1,mat,t);
      //below
      int b= solve(i+1,j,mat,t);

      return t[i][j]=1+Math.min(r,Math.min(d,b));
    }
    public int countSquares(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        int t[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                t[i][j]=-1;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==1){
                    sum+=solve(i,j,matrix,t);
                }
            }
        }
        return sum;
    }
}