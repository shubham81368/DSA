import java.util.*;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        next=null;
    }
}
class Queue {
    //Write your code here

    Node front,rear;
    int size=0;
    public void push(int value) {
        //Write your code here
        Node newNode=new Node(value);
        if(front==null){
            front=newNode;
            rear=newNode;
            size++;
        }
        else{
            rear.next=newNode;
            rear=newNode;
            size++;
        }
    }
    public int pop() {
        //Write your code here
        if(front==null){
            return -1;
        }
        
            int data=front.val;
            front=front.next;
            size--;
        
        return data;
    }
    public int front() {
        //Write your code here
        if(front==null)return -1;
        return front.val;
    }
    public int getSize() {
        //Write your code here
        return size;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int op = sc.nextInt();
            if(op == 1) {
                int x = sc.nextInt();
                q.push(x);
            }
            else if(op == 2) {
                System.out.println(q.pop());
            }
            else if(op == 3)
                System.out.println(q.front());
            else if(op == 4)
                System.out.println(q.getSize());
        }
    }
}