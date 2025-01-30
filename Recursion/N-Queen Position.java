  public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>pos=new ArrayList<>();
        int[][] board=new int[n][n];
        
        
        helper(board,0,n,pos,ans);
        return ans;
    }
    
    void helper(int[][] board,int i,int n,ArrayList<Integer>pos,ArrayList<ArrayList<Integer>>ans){
        if(i==n){
            ans.add(new ArrayList<Integer>(pos));
            return;
        }
        
        for(int j=0;j<n;j++){
            if(isSafe(i,j,board,n)){
                board[i][j]=1;
                pos.add(j+1);
                helper(board,i+1,n,pos,ans);
                pos.remove(pos.get(pos.size()-1));
                board[i][j]=0;
                
            }
        }
    }
    
    public boolean isSafe(int row,int col,int[][] board,int n){
        //check for row
        for(int j=0;j<=col;j++){
            if(board[row][j]==1)return false;
        }
        //check for col
        for(int i=0;i<=row;i++){
            if(board[i][col]==1)return false;
        }
        //check for left diagonal
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]==1)return false;
        }
        //chec for right diagonal
        for(int i=row,j=col;i>=0 && j<n;i--,j++){
            if(board[i][j]==1)return false;
        }
        return true;
    }