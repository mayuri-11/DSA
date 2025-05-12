
package BST;
// PRINT NUMBER IN RANGE OF X TO Y IN BST.
public class PrintInRange {
    public  static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public static Node insertBst(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }

        if(data < root.data){
            root.left = insertBst(root.left, data);
        }
        else if(data > root.data){
            root.right = insertBst(root.right, data);
        }

        return root;
    }

    public static void printInRange(Node root,int x,int y){
        if(root == null) return;

        if(root.data >=x && root.data <= y){
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        }
        else if(root.data >= y){
            printInRange(root.left, x, y);
        }
        else{
            printInRange(root.right, x, y);
        }

    }

    public static void main(String[] args) {
        int nums[] = {5,6,2,8,9,1};
        Node root = null;
        for(int i = 0; i < nums.length; i++){
            root = insertBst(root, nums[i]);
        }

        printInRange(root,2,9);
    }
}
