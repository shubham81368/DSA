class Node{
    int key;
    int val;
    Node prev;
    Node next;
    Node(int k,int v){
        key=k;
        val=v;
    }
}

class LRUCache {
    // Constructor for initializing the cache capacity with the given value.
    static Node head=new Node(-1,-1);
    static Node tail=new Node(-1,-1);
    static HashMap<Integer,Node>mp;
   static  int capacity;
    LRUCache(int cap) {
        // code here
        mp=new HashMap<>();
        head.next=tail;
        tail.prev=head;
        mp=new HashMap<>();
        capacity=cap;
    }

    // Function to return value corresponding to the key.
    public static int get(int key) {
        // your code here
        if(!mp.containsKey(key))return -1;
        Node node=mp.get(key);
        remove(node);
        insertFront(node);
        return node.val;
    }

    // Function for storing key-value pair.
    public static void put(int key, int value) {
        // your code here
        if(mp.containsKey(key)){
           remove(mp.get(key));
        }
        if(mp.size()==capacity){
            remove(tail.prev);
            
        }
        insertFront(new Node(key,value));
    }
    
    public static void remove(Node node){
        mp.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public static void insertFront(Node node){
        mp.put(node.key,node);
        node.next=head.next;
        node.next.prev=node;
        head.next=node;
        node.prev=head;
    }