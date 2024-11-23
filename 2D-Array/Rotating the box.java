class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int n=box.length;
        int m=box[0].length;
        
        char[][] grid=new char[m][n];

        //first transpose
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=box[j][i];
            }
        }

        //now we reverse each row
        for(int i=0;i<m;i++){
            reverse(grid[i]);
        }

        //now apply the gravity
        for(int j=0;j<n;j++){
            for(int i=m-1;i>=0;i--){
                if(grid[i][j]=='.'){
                    int stonerow=-1;
                    for(int k=i-1;k>=0;k--){
                        if(grid[k][j]=='*'){
                            break;
                        }
                        else if(grid[k][j]=='#'){
                            stonerow=k;
                            break;
                        }
                    }
                    if(stonerow!=-1){
                        grid[i][j]='#';
                        grid[stonerow][j]='.';
                    }
                }
            }
        }
            return grid;
        
    }


    //reverse 
     void reverse(char[] mat){
        for(int i=0;i<mat.length/2;i++){
             char temp=mat[i];
             mat[i]=mat[mat.length-1-i];
             mat[mat.length-i-1]=temp;
        }
     }
}
