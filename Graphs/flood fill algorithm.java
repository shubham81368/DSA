class Solution {
    int n;
    int m;
    public int[][] floodFill(int[][] image, int sr, int sc,int newColor) {
        // Code here
        n=image.length;
        m=image[0].length;
        
        int vis[][]=new int[n][m];
        
        dfs(image,sr,sc,vis,image[sr][sc],newColor);
        return image;
    }
    
    public void dfs(int[][] image ,int r,int c,int[][] vis,int currColor,int newColor){
        if(r<0 || r>=n || c<0 || c>=m || image[r][c]!=currColor || vis[r][c]==1){
            return ;
        }
        
         vis[r][c]=1;
         image[r][c]=newColor;
         
         //up
         dfs(image,r-1,c,vis,currColor,newColor);
         //right
         dfs(image,r,c+1,vis,currColor,newColor);
         //down
         dfs(image,r+1,c,vis,currColor,newColor);
         //left
         dfs(image,r,c-1,vis,currColor,newColor);
         
    }
    
}