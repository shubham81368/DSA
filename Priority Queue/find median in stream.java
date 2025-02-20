   public ArrayList<Double> getMedian(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Double>res=new ArrayList<>();
         PriorityQueue<Integer>max=new PriorityQueue<>(Collections.reverseOrder());
         PriorityQueue<Integer>min=new PriorityQueue<>();
         
         for(int i=0;i<arr.length;i++){
              int num=arr[i];
              if(max.size()==0){
                  max.offer(num);
              }
              else if(!max.isEmpty() && max.peek()>num){
                  max.offer(num);
              }
              else{
                  min.offer(num);
              }
              if(max.size()<min.size()){
                  max.offer(min.poll());
              }
              else if(max.size()-min.size()==2){
                  min.offer(max.poll());
              }
              
              if(i%2==0){
                  res.add((double)max.peek());
              }
              else{
                  res.add((double)((max.peek()+min.peek())/2.0));
              }
         }
         
    return res;
    }