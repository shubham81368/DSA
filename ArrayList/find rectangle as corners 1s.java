class Solution {
    public boolean ValidCorner(int mat[][]) {
        // Code here
        int n=mat.length;
        int m=mat[0].length;
        
        Set<String>set=new HashSet<>();
        //isme hammm col store karenge jahan 1 hai har row me vo bhi string ki form me
        for(int r=0;r<n;r++){
            ArrayList<Integer>col=new ArrayList<>();
            for(int c=0;c<m;c++){
                if(mat[r][c]==1){
                    col.add(c);
                }
            }
            
            for(int x=0;x<col.size()-1;x++){
                for(int y=x+1;y<col.size();y++){
                    String s=""+col.get(x)+'-'+col.get(y);
                    if(set.contains(s))return true;
                    set.add(s);
                }
            }
        }
        
        return false;
    }
}