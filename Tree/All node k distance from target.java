import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {
    static HashMap<Node, Node> parentMap = new HashMap<>();

    // Helper function to map parents during inorder traversal
    static void mapParents(Node root) {
        if (root == null) return;
        if (root.left != null) parentMap.put(root.left, root);
        if (root.right != null) parentMap.put(root.right, root);
        mapParents(root.left);
        mapParents(root.right);
    }

    // BFS to find nodes at distance k from the target
    static void bfs(Node target, int k, ArrayList<Integer> res) {
        Queue<Node> queue = new LinkedList<>();
        Set<Node> visited = new HashSet<>();
        queue.offer(target);
        visited.add(target);

        while (!queue.isEmpty() && k >= 0) {
            int size = queue.size();
            if (k == 0) break;  // We have found nodes at distance k

            while (size-- > 0) {
                Node curr = queue.poll();

                // Explore left child
                if (curr.left != null && !visited.contains(curr.left)) {
                    visited.add(curr.left);
                    queue.offer(curr.left);
                }

                // Explore right child
                if (curr.right != null && !visited.contains(curr.right)) {
                    visited.add(curr.right);
                    queue.offer(curr.right);
                }

                // Explore parent node
                Node parent = parentMap.get(curr);
                if (parent != null && !visited.contains(parent)) {
                    visited.add(parent);
                    queue.offer(parent);
                }
            }
            k--;
        }

        // Collect remaining nodes at distance k
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            res.add(node.data);
        }
    }

    public static ArrayList<Integer> KDistanceNodes(Node root, int target, int k) {
        mapParents(root);

        // Find the target node in the tree
        Node targetNode = findNode(root, target);
        ArrayList<Integer> res = new ArrayList<>();
        bfs(targetNode, k, res);
        return res;
    }

    // Helper function to find the target node in the tree
    private static Node findNode(Node root, int target) {
        if (root == null) return null;
        if (root.data == target) return root;

        Node leftSearch = findNode(root.left, target);
        if (leftSearch != null) return leftSearch;

        return findNode(root.right, target);
    }
}

public class Main {
    static Node buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') return null;
        String[] ip = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty() && i < ip.length) {
            Node currNode = queue.poll();
            String currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= ip.length) break;
            currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();  // Input the tree as a string
        int n = sc.nextInt();      // Target node value
        int K = sc.nextInt();      // Distance K

        Node root = buildTree(s);
        Solution tree = new Solution();
        ArrayList<Integer> ans = tree.KDistanceNodes(root, n, K);

        Collections.sort(ans);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
