class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        // code here
        int size=arr.size();
        int k=1;
        while(size>1){
            //first rotate last element comes at first place and shifting done by arraylist automaticlally
            arr.add(0,arr.remove(size-1));
            int id=size-k;
            if(id<0)id=0;
            //ab delete element
            arr.remove(id);
            size--;
            k++;
        }
       return arr.get(0);
    }
}
