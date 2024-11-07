import java.io.*;
import java.util.*;
 
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

class Solution {
    static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node fwd=null;
        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }

    public static void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    static void unfold(Node head)
    {
     // Your code here
       Node curr=head;
       Node dummy1=null;
       Node dummy2=null;
       Node first=null;
       Node second=null;

       int len=0;
       while(curr!=null){
        if(len%2==0){
            
            if(dummy1==null){
                dummy1=curr;
                first=curr;
            
            }
            else{
                dummy1.next=curr;
                dummy1=dummy1.next;
            }
        
        }
        else{
           
             if(dummy2==null){
                dummy2=curr;
                second=curr;
            
            }
            else{
                dummy2.next=curr;
                dummy2=dummy2.next;
            }
        
        }
        curr=curr.next;
        len++;
       }
       
       dummy2=reverse(second);
       dummy1.next=dummy2;
      print(first);
    }
}
public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1= new LinkedList();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        Solution Ob = new Solution();
        Ob.unfold(l1.head);
    }
}