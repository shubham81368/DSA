
class Solution {
    Stack<Integer>st1;
    Stack<Integer>st2;
    
    public Solution() {
        st1=new Stack<>();
        st2=new Stack<>();
    }

    // Add an element to the top of Stack
    public void push(int x) {
        // code here
         if(st1.isEmpty()){
            st1.push(x);
            st2.push(x);
        } 
        else{
            st1.push(x);
           
            st2.push(Math.min(x,st2.peek()));
        }
        
    }

    // Remove the top element from the Stack
    public void pop() {
        // code here
        if(!st1.isEmpty()){

            st2.pop();
            st1.pop();
        }
    }

    // Returns top element of the Stack
    public int peek() {
        // code here
        if(st1.isEmpty())return -1;
        return st1.peek();
    }

    // Finds minimum element of Stack
    public int getMin() {
        // code here
        if(st2.isEmpty())return -1;
        return st2.peek();
    }
}