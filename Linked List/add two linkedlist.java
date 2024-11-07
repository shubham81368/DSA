import java.util.*;
import java.io.*;
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
    void add(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
}
public class Main {
    public static Node reverse(Node node){
        Node prev = null;
        Node curr = node;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }
    
public static void combine(Node a, Node b, LinkedList ans){
            // write your code here
            int carry=0;
            Node num1=a;
            Node num2=b;
            while(num1!=null && num2!=null){
                int sum=num1.data+num2.data+carry;
                ans.add(sum%10);
                carry=sum/10;
                num1=num1.next;
                num2=num2.next;
            }
            while(num1!=null){
                int sum=num1.data+carry;
                ans.add(sum%10);
                carry=sum/10;
                num1=num1.next;
            }

            while(num2!=null){
                int sum=num2.data+carry;
                ans.add(sum%10);
                carry=sum/10;
                num2=num2.next;
            }

            if(carry!=0){
                ans.add(carry);
            }


    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        LinkedList a = new LinkedList();
        LinkedList b = new LinkedList();
        for(int i = 0; i < n; i++){
            a.add(input.nextInt());
        }
        for(int i = 0; i < m; i++){
            b.add(input.nextInt());
        }
        a.head = reverse(a.head);
        b.head = reverse(b.head);
        LinkedList ans = new LinkedList();
        combine(a.head, b.head, ans);
        ans.head = reverse(ans.head);
        Node h = ans.head;
        while(h != null){
            System.out.print(h.data + " ");
            h = h.next;
        }
        System.out.println("");
    }
}