import java.io.*;
import java.util.*;

class StackQueue
{
    //Function to push an element in queue by using 2 stacks.
    Stack<Integer>s1=new Stack();
    Stack<Integer>s2=new Stack();
    
    void Push(int x)
    {
	   //Write your code here
       s1.add(x);
	  
    }
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   //Write your code here
       if(s2.isEmpty()){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
       }
       if(s2.isEmpty()){
        return -1;//queue is empty;
       }
       else{
        return s2.pop();
       }
    }
}
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);  
        StackQueue s = new StackQueue();	
        int q = sc.nextInt();
        ArrayList<Integer> ans= new ArrayList<>();
        while(q>0)
        {
            int QueryType = sc.nextInt();
            if(QueryType == 1)
            {
                int a = sc.nextInt();
                s.Push(a);
            }
            else if(QueryType == 2)
            ans.add(s.Pop());
        q--;
        }	
        for(int x:ans)
        System.out.print(x+" ");       
     System.out.println();
    }
}