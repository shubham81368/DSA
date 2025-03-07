import java.io.*;
import java.util.*;
public class Main {

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
}    
    public static void main(String args[]) {
        //Write code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        LinkedList l1=new Main().new LinkedList();
        LinkedList l2=new Main().new LinkedList();
        while(n-->0){
           l1.add(sc.nextInt());
        }
        while(m-->0){
            l2.add(sc.nextInt());
        }
        
        System.out.print(check(l1,l2));
    }

    public static int check(LinkedList l1,LinkedList l2){
        Node n1=l1.head;
        Node n2=l2.head;
        while(n1!=null && n2!=null){
            if(n1.data!=n2.data)return 0;
    
                n1=n1.next;
                n2=n2.next;
        
        }

        if(n1!=null)return 0;
        if(n2!=null)return 0;
        return 1;
    }
}