class CustomStack {
    int stack[];
    int size=0;
    int capacity=0;
    int index;

    public CustomStack(int maxSize) {
        stack=new int[maxSize];
        capacity=maxSize;
        index=-1;
        size=0;

    }
    
    public void push(int x) {
        if(isFull()){
            return;
        }
        index++;//because itially index=-1 hai;
        size++;
        stack[index]=x;
    }
    
    public int pop() {
        if(isEmpty()){
            return -1;
        }
        int val=stack[index];
           index--;
           size--;
           return val;
    }
    
    public void increment(int k, int val) {
        if(isEmpty()){
            return;
        }
        int min=Math.min(size,k);
        for(int i=0;i<min;i++){
            stack[i]+=val;
        }
        
    }

    //create karenge isFull() or isEmpty method ko
    boolean isFull(){
       return size==capacity;
    }
    boolean isEmpty(){
        return size==0;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */