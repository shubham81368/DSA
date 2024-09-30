import java.util.*;

class Main {
    public static void main(String[] args) {
        StackUsingArray obj = new StackUsingArray();
        Scanner sc = new Scanner(System.in);
        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            int x;
            x = sc.nextInt();
            if (x == 1) {
                int y;
                y = sc.nextInt();
                obj.push(y);
            }
            if (x == 2) {
                System.out.println(obj.peek());
            }
            if (x == 3) {
                obj.pop();
            }
            if (x == 4) {
                obj.display();
                System.out.println();
            }
        }
        sc.close();
    }
}

class StackUsingArray {

    ArrayList < Integer > st;
    
    StackUsingArray() {
        //Complete the function
        st=new ArrayList<>();
        
    }

    public void push(int x) {
        //Complete the function
        st.add(x);
    
    }

    public int peek() {
        //Complete the function
        if(st.size()==0)return -1;
        return st.get(st.size()-1);
    }

    public void pop() {
        //Complete the function
        if(st.size()==0){
            return;
        }else{
            st.remove(st.size()-1);
            
        }
    }

    public void display() {
        //Complete the function
       
        for(int i=st.size()-1;i>=0;i--){
            System.out.print(st.get(i)+" ");
        }
    }
}