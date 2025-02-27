class twoStacks {
    int arr[];
    int top1;
    int top2;
    int size;
    
    twoStacks() {
        arr=new int[100];
        top1=-1;
        top2=100;
        size=100;
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here
        if(top1+1!=top2){
            arr[++top1]=x;
        }
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        // code here
        if(top2-1!=top1){
            arr[--top2]=x;
        }
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        // code here
        if(top1==-1)return -1;
        int ele=arr[top1];
        top1--;
        return ele;
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        // code here
        if(top2==size)return -1;
        int ele=arr[top2];
        top2++;
        return ele;
    }
}