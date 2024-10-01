import java.io.*;
import java.util.*;

class Stack
{
    Queue<Integer>q=new ArrayDeque<>();
    void push(int a)
    {
        // your code here
        q.add(a);
      

    }
    
    int pop()
    {
        // your code here
        int size=q.size();
        if(size==0)return -1;
        int i=1;
        while(i<size){
            int ele=q.remove();
            q.add(ele);
            i++;
        }
        
        return q.remove();

    }	
}
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);    
        Stack g = new Stack();			
        int q = sc.nextInt();
        while(q>0)
        {
            int QueryType = sc.nextInt();
            if(QueryType == 1){
                int a = sc.nextInt();
                    // call push function here
                    g.push(a);
            }
            else if(QueryType == 2){
                    // call pop function here
                    System.out.print(g.pop()+" ");
            }
            q--;
        }	
    }
}