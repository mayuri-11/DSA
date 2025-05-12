package BST;

// Build Binary Search Tree
public class BuildBst {
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

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // Search any Element in BST
    public static boolean searchInBst(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(key < root.data){
            return searchInBst(root.left, key);
        }
        else{
            return searchInBst(root.right, key);
        }
    }
    public static void main(String[] args) {
        int nums[] = {5,6,2,8,9,1};
        Node root = null;
        for(int i = 0; i < nums.length; i++){
            root = insertBst(root, nums[i]);
        }
        inOrder(root);

        System.out.println(searchInBst(root, 1));
    }
}
