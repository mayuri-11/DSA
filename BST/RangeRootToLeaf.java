package BST;

import java.util.ArrayList;

public class RangeRootToLeaf {
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

    public static void printPath(ArrayList<Integer> path){
        for(int i = 0; i < path.size(); i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println();
    }
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        // leaf
        if(root.left == null && root.right == null){
            printPath(path);
        }else{ // non-leaf
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int nums[] = {5,6,2,8,9,1};
        Node root = null;
        for(int i = 0; i < nums.length; i++){
            root = insertBst(root, nums[i]);
        }
        
        ArrayList<Integer> path = new ArrayList<>();
        printRoot2Leaf(root, path);

    }
}
