class Solution {
    static int n;
    static int m;
    static public boolean isWordExist(char[][] mat, String word) {
        // Code here
         n=mat.length;
          m=mat[0].length;
        
        int[][] vis=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==word.charAt(0)){
                    if(helper(mat,i,j,0,word,vis))return true;;
                }
            }
        }
        return false;
    }
    
    
    static boolean helper(char[][]mat,int i,int j,int idx,String word,int vis[][]){
        if(idx==word.length())return true;
        
        if(i<0 || j<0 || i>=n || j>=m || vis[i][j]==1||mat[i][j]!=word.charAt(idx))return false;
        
        vis[i][j]=1;
        
        if(helper(mat,i+1,j,idx+1,word,vis) || helper(mat,i,j+1,idx+1,word,vis)||
            helper(mat,i,j-1,idx+1,word,vis) || helper(mat,i-1,j,idx+1,word,vis))return true;
            
            //duskre liye unvisited karna hofa
            vis[i][j]=0;
        
        return false;
    }