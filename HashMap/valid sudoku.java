class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                //check karenge vo number pahele bhi to nhi aaya row me
                if(!set.add(board[i][j]+"in row"+i)){
                    return false;
                }

                //ab column me bhi check karenge
                if(!set.add(board[i][j]+"in col"+j)){
                    return false;
                }
                //ab grid me check karenge
                if(!set.add(board[i][j]+"in grid"+i/3+j/3)){
                    return false;
                }
            }
        }

        return true;
    }
}