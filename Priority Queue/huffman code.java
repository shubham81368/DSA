import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine().trim();
        int N = S.length();
        Solution ob = new Solution();
        String[] element = br.readLine().trim().split("\\s+");
        int[] f = new int[N];
        for(int i = 0; i < N; i++){
            f[i] = Integer.parseInt(element[i]);
        }
        ArrayList<String> res  = ob.huffmanCodes(S,f,N);
        for(int i = 0; i < res.size(); i++)
        {
            System.out.print(res.get(i)+" ");
        }
        System.out.println();
    
	}
}

class Huffman{
    int data;
    char ch;
    Huffman left,right;
    Huffman(){}
    Huffman(int d,char c){
        data=d;
        ch=c;
        left=null;
        right=null;
    }}
    class HuffmanCom implements Comparator<Huffman>{
      public  int compare(Huffman h1,Huffman h2){
            if(h1.data<h2.data){
                return h1.data-h2.data;
            }
            return 1;//means agar dono ki frequency same hai to
            // jo pahele aa rha hai vo print kar do
        }
    }

class Solution {
    public ArrayList<String> huffmanCodes(String S, int f[], int N)
    {
        // Code here
        PriorityQueue<Huffman>pq=new PriorityQueue<>(new HuffmanCom());

        for(int i=0;i<N;i++){
            Huffman hf=new Huffman(f[i],S.charAt(i));
            pq.add(hf);
        }
        //we have created the huffman tree
        while(pq.size()>1){
            Huffman first=pq.remove();
            Huffman second=pq.remove();
            int sum=first.data+second.data;
            Huffman par=new Huffman(sum,'-');
            par.left=first;
            par.right=second;
            pq.add(par);
        }
        //now we have to print the path to leaf node
        ArrayList<String>ans=new ArrayList<>();
        //or pq me akhri node hammara root hoga
        Huffman root=pq.remove();
        preOrder(root,"",ans);
        return ans;
    }

    public void preOrder(Huffman root,String curr,ArrayList<String>ans){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            ans.add(curr);
            return;
        }
        preOrder(root.left,curr+'0',ans);
        preOrder(root.right,curr+'1',ans);
    }
    
}