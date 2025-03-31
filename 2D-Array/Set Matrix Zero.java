class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int dummy[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dummy[i][j]=matrix[i][j];
            }
        }
        Set<Integer>row=new HashSet<>();
        Set<Integer>col=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
         //for row
         for(int i=0;i<n;i++){
            if(row.contains(i)){
                for(int j=0;j<m;j++){
                    dummy[i][j]=0;
                }
            }
         }
         //for col
         for(int j=0;j<m;j++){
            if(col.contains(j)){
                for(int i=0;i<n;i++){
                    dummy[i][j]=0;
                }
            }
         }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=dummy[i][j];
            }
            
        }
        
    }
}