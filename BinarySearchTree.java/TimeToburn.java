import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) arr[i] = sc.next();
    int k = sc.nextInt();
    sc.close();
    Node tree = levelOrderCreateTree(arr);
    System.out.println(timeToBurnTree(tree, k));
  }

  
  public static int timeToBurnTree(Node root, int start) {
     
    //   Write your code here
    //agar tree burn hoga to uske neighbour bhi burn honge par  parent ka access karne ke liye childparen map bnayenge
    Map<Node,Node>childParent=new HashMap<>();
    //ab insert bhi karna hoga map
    prepareMap(root,childParent);//o(n)
    //find start jhan se tree burn start hoga tree me
    Node startNode=findNode(root,start);
    //ham set use karnge burnig node ko store karne ke liye kyoki jb parent ko acess karenge to infinte loop me calling fss jayega
    HashSet<Node>burnNode=new HashSet<>();
    //ek time count karne ke liye
    int time=0;
    Queue<Node>q=new ArrayDeque<>();
    q.add(startNode);
    burnNode.add(startNode);
    while(!q.isEmpty()){
      int size=q.size();
      for(int i=0;i<size;i++){
      Node curr=q.remove();
      if(curr.left!=null && burnNode.contains(curr.left)==false){
        q.add(curr.left);
        burnNode.add(curr.left);
      }
      if(curr.right!=null && burnNode.contains(curr.right)==false){
        q.add(curr.right);
        burnNode.add(curr.right);
      }
      //ab parent bhi to burn ho rha hoga to usko bhi add karna hai
      if(childParent.get(curr)!=null && burnNode.contains(childParent.get(curr))==false){
        q.add(childParent.get(curr));
        burnNode.add(childParent.get(curr));
      }
    }
    time++;
    }
    
  return time-1;//kyoki tree zero sec se burn ho rha hai
   
  }

  public static Node findNode(Node root,int start){
    if(root==null)return null;
    //agart start node he equal aa gya burn start ke
    if(root.data==start){
      return root;
    }
    //ab left me jake check karnge
    Node leftChild=findNode(root.left,start);
    if(leftChild!=null){//means burn left child ke node se start ho rha hai
       return leftChild;
    }
    Node rightChild=findNode(root.right,start);
    if(rightChild!=null){
      return rightChild;
    }
    //agar burning node present nhi hai tree me to null return hoga
    return null;
  }

  public static void prepareMap(Node root,Map<Node,Node>childParent){
    if(root==null)return;
    childParent.put(root.left,root);//left ka parent
    childParent.put(root.right,root);//right ka parent
    //baki node ke liye recursion
    prepareMap(root.left,childParent);
    prepareMap(root.right,childParent);
  }

  static void createTree(Node node, int i, String[] arr) {
    if (node != null) {
      if (2 * i + 1 < arr.length) {
        if (arr[2 * i + 1].equals("null")) {
          node.left = null;
        } else {
          node.left = new Node(Integer.parseInt(arr[2 * i + 1]));
        }
        createTree(node.left, 2 * i + 1, arr);
      }
      if (2 * i + 2 < arr.length) {
        if (arr[2 * i + 2].equals("null")) {
          node.right = null;
        } else {
          node.right = new Node(Integer.parseInt((arr[2 * i + 2])));
        }
        createTree(node.right, 2 * i + 2, arr);
      }
    }
  }

  static Node levelOrderCreateTree(String[] arr) {
    if (arr.length == 0) return null;
    Node head = new Node(
      Integer.parseInt(arr[0])
    );
    createTree(head, 0, arr);
    return head;
  }
}

class Node {

  int data;
  Node left;
  Node right;

  public Node(int data) {
    this.data = data;
  }
}
