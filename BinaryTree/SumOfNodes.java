package BinaryTree;

public class SumOfNodes {
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

    public static int sumOfNodes(Node root){
        if(root == null) return 0;

        int leftNodes = sumOfNodes(root.right);
        int rightNodes = sumOfNodes(root.left);

        return leftNodes+rightNodes+root.data;
    }

    public static void main(String[] args) {
        int nodes[] = {7,2,4,-1,-1,5,-1,-1,3,-1,5,-1,-1};
        Node root = BinaryTree.buildTree(nodes);

        System.out.println(sumOfNodes(root));

    }
}
