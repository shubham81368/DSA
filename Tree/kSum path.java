   int cnt;
    public int sumK(Node root, int k) {
        // code here
        cnt=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        
        helper(root,k,0,map);
        return cnt;
    }
    
    void helper(Node root,int k,int csum,HashMap<Integer,Integer>map){
        if(root==null)return ;
        csum+=root.data;
        if(csum==k)cnt++;
        
        if(map.containsKey(csum-k))cnt+=map.get(csum-k);
         map.put(csum,map.getOrDefault(csum,0)+1);
         
         helper(root.left,k,csum,map);
         helper(root.right,k,csum,map);
         
         map.put(csum,map.getOrDefault(csum,0)-1);//bcz rigth path me left wala sum exit nhi karega
         if(map.get(csum)==0)map.remove(csum);
        
    }