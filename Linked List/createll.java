import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}

}

class LinkedList{
    Node head;

	//print linked LinkedList
	void print(){//o(n)
		Node curr=head;
		while(curr!=null){
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
		System.out.println("null");
	}

	//add element to LinkedList
	void add(int ele){//O(n)
		Node newnode=new Node(ele);
		if(head==null){
			head=newnode;
			return;
		}
		Node curr=head;
		while(curr.next!=null){
			curr=curr.next;
		}
		curr.next=newnode;
	}

	//add element to front of LinkedList
	void addToFront(int ele){//o(1);
		Node newNode=new Node(ele);
		if(head==null){
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}

	//delete element from last
	void deleteLast(){//o(n)
		if(head==null)return;
		if(head.next==null){
			head=null;
			return;
		}
		Node curr=head;
		while(curr.next.next!=null){
			curr=curr.next;
		}
		curr.next=null;
	}

	int length(){
		Node curr=head;
		int size=0;
		while(curr!=null){
			size++;
			curr=curr.next;
		}
		return size;
	}

}

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		LinkedList l=new LinkedList();
		// l.print();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.print();
		l.deleteLast();
		l.print();
		
		System.out.println(l.length());
		l.addToFront(0);
		l.print();
	}
}