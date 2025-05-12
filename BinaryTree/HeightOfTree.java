package BinaryTree;
// Find Height of Binary tree
public class HeightOfTree {
    public static class Node{
        int data;
        Node left,right;
        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static class BuildTree{
        static int index = -1;
        public static Node buildNode(int arr[]){
            index++;
            if(arr[index] == -1) return null;

            Node newNode = new Node(arr[index]);
            newNode.left = buildNode(arr);
            newNode.right = buildNode(arr);

            return newNode;
        }
    }

    public static int height(Node root){
        if(root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
   public static void main(String[] args) {
     int nodes[] = {7,2,4,-1,-1,5,-1,-1,3,-1,5,-1,-1};
     Node root = BuildTree.buildNode(nodes);
     System.out.println(height(root));
    } 
}
