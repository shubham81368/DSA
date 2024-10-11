class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        // Code here
        
        for(int i=0;i<arr.size();i++){
            while(arr.get(i)!=-1 && arr.get(i)!=i){
                  int id=arr.get(i);
                  arr.set(i,arr.get(id));
                  arr.set(id,id);
                }
        }
            
        
        return arr;
        
    }
  
}