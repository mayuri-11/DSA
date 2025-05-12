package BinaryTree;

public class BinaryTreeYt {
    public static class Node{
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;

        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1) return null;

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // PreOrder Traversal of binary tree
    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder Traversal of binary tree
    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // PostOrder Traversal of binary tree
    public static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    //Count number of nodes in binary tree
    public static int countOfNodes(Node root){
        if(root == null) return 0;

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes+rightNodes+1;
    }
    public static void main(String[] args) {
        int nodes[] = {7,2,4,-1,-1,5,-1,-1,3,-1,5,-1,-1};
        Node root = BinaryTree.buildTree(nodes);
        
        System.out.println(root.data);

        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        
        System.out.println();
        int noOfNodes = countOfNodes(root);
        System.out.println(noOfNodes);
    }
}
