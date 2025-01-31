    static void solveSudoku(int[][] mat) {
        // code here
        helper(mat,0,0);
    }
    
    static boolean helper(int mat[][],int row,int col){
        if(row==mat.length)return true;
        
        int nrow=0;
        int ncol=0;
        if(col!=mat.length-1){
            ncol=col+1;
            nrow=row;
        }
        else{
            nrow=row+1;
            ncol=0;
        }
        
        if(mat[row][col]!=0){
            if(helper(mat,nrow,ncol))return true;
        }
        else{
            for(int i=1;i<=9;i++){
                if(isSafe(mat,row,col,i)){
                    mat[row][col]=i;
                    if(helper(mat,nrow,ncol)){
                        return true;
                    }
                    else{
                        mat[row][col]=0;
                    }
                }
            }
        }
        return false;
    }
    
    
    //ab ham check karenge row,col or grid me
    static boolean isSafe(int mat[][],int row,int col,int num){
        for(int i=0;i<mat.length;i++){
            if(mat[i][col]==num)return false;
            if(mat[row][i]==num)return false;
        }
        
        //ab ham grid me check karenge
        int sr=(row/3)*3,  sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(mat[i][j]==num)return false;
            }
        }
        return true;
    }