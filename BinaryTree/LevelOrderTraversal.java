package BinaryTree;

import java.util.*;

public class LevelOrderTraversal{
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

    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
  
        while(!q.isEmpty()){
            Node currNode = q.remove();

            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data + " ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }

    }

    public static void main(String[] args) {
        int nodes[] = {7,2,4,-1,-1,5,-1,-1,3,-1,5,-1,-1};
        Node root = BinaryTree.buildTree(nodes);

        levelOrder(root);
    }
}