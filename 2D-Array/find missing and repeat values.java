class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int n=grid.length;
        int m=grid[0].length;
        int repeat=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mp.put(grid[i][j],mp.getOrDefault(grid[i][j],0)+1);
                if(mp.get(grid[i][j])>1)repeat=grid[i][j];
            }
        }
        int num=1;
        while(mp.containsKey(num)){
            num++;
        }
       int[] ans=new int[2];
       ans[0]=repeat;
       ans[1]=num;
       return ans;
    }
}