class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],i);
        }

        int minIdx=Integer.MAX_VALUE;
        //check by row wise
        for(int i=0;i<m;i++){
            int lastIdx=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                lastIdx=Math.max(lastIdx,mp.get(mat[i][j]));
            }
            minIdx=Math.min(minIdx,lastIdx);
        }

        //check col wise
        for(int j=0;j<n;j++){
            int lastIdx=Integer.MIN_VALUE;
            for(int i=0;i<m;i++){
               lastIdx=Math.max(lastIdx,mp.get(mat[i][j]));
            }
            minIdx=Math.min(minIdx,lastIdx);
        }
        return minIdx;
    }
}


/*class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
           int m=mat.length;
           int n=mat[0].length;
           HashMap<Integer,int[]>mp=new HashMap<>();
           for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mp.put(mat[i][j],new int[]{i,j});
            }
           }

           //now iterate over the  arr and check row or column painted or not
           for(int i=0;i<arr.length;i++){
              int[] coordinate=mp.get(arr[i]);
              int r=coordinate[0];
              int c=coordinate[1];
              mat[r][c]*=-1;

              if(checkRowPainted(mat,r)|| checkColPainted(mat,c)){
                return i;
              }

           }
           return -1;
    }

    boolean checkRowPainted(int[][] mat,int r){
        int cnt=0;
        for(int i=0;i<mat[0].length;i++){
            if(mat[r][i]<0)cnt++;
        }
        return cnt==mat[0].length;
    }

    boolean checkColPainted(int[][] mat,int c){
        int cnt=0;
        for(int i=0;i<mat.length;i++){
            if(mat[i][c]<0)cnt++;
        }
        return cnt==mat.length;
    }
}*/