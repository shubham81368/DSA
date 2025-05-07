class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        ArrayList<Integer>path=new ArrayList<>();
        helper(root,res,path);
        return res;
    }
    
    public static void helper(Node node,ArrayList<ArrayList<Integer>>res,ArrayList<Integer>path){
        if(node==null){
            return;
        }
                path.add(node.data);
                
        if(node.left==null && node.right==null){
            res.add(new ArrayList<>(path));
        }
        else{
        helper(node.left,res,path);
        helper(node.right,res,path);
        }
        
        path.remove(path.size()-1);
        
    }
}