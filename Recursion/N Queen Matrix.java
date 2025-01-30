class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        helper(board,0,ans,n);
        return ans;
    }

    public void helper(char[][] board,int i,List<List<String>>ans,int n){
        if(i==n){
            ans.add(construct(board));
            return ;
        }

        for(int j=0;j<n;j++){
            if(isSafe(i,j,board,n)){
                board[i][j]='Q';
                helper(board,i+1,ans,n);
                board[i][j]='.';
            }
        }
    }

    public boolean isSafe(int row,int col,char[][] board,int n){
        //check horizontally
        for(int j=0;j<=col;j++){
            if(board[row][j]=='Q')return false;
        }

        //check vertically
        for(int i=0;i<=row;i++){
            if(board[i][col]=='Q')return false;
        }

        //check left diagonal
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q')return false;
        }

        //check right diagonal
        for(int i=row,j=col;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q')return false;
        }

        return true;
    }

    List<String> construct(char[][] board){
        List<String>res=new ArrayList<>();
        for(char[] row:board){
            res.add(new String(row));
        }
        return res;
    }
}