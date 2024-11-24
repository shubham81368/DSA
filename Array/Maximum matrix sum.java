class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        long sum=0;
        int min=Integer.MAX_VALUE;
        int cntNegative=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]<0)cntNegative++;
                sum+=Math.abs(matrix[i][j]);
                min=Math.min(min,Math.abs(matrix[i][j]));
            }
        }
        if(cntNegative%2==0)return sum;
       System.out.print(min);

        return sum-2*min;
    }
}