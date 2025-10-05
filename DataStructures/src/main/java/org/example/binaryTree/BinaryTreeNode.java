package org.example.binaryTree;


import java.util.ArrayList;
import java.util.List;

/*
Binary tree traversal has 2 categories
   depth-first and breadth first
   depth-first -> pre-order, in-order, post-order
   breadth-first -> level-order
   Pre-order: Root → Left → Right
   in-order: Left → Root → Right
   post-order: Left → Right → Root

        A
       / \
      B   C
     / \   \
    D   E   F

 */
public record BinaryTreeNode(
         String data,
         BinaryTreeNode rightNode,
         BinaryTreeNode leftNode
) {

    public BinaryTreeNode {
        if (data == null) {
            throw new IllegalArgumentException("Data cannot be null");
        }
    }

    public BinaryTreeNode(String data) {
       this(data,null,null);
    }

    public static BinaryTreeNode leaf(String data){
       return  new BinaryTreeNode(data);
    }

    public static BinaryTreeNode withChildren(String data, BinaryTreeNode left, BinaryTreeNode right) {
        return new BinaryTreeNode(data, left, right);
    }



    public List<String> inOrderTraversal(){
        var result = new ArrayList<String>();
        inOrderTraversalHelper(this, result);
        return result;
    }

    public void inOrderTraversalHelper(BinaryTreeNode node, List<String> result){
        if(node!=null){
            inOrderTraversalHelper(node.leftNode(),result);
            result.add(node.data());
            inOrderTraversalHelper(node.rightNode(),result);
        }
    }

    public List<String> preOrderTraversal(){
        var result = new ArrayList<String>();
        preOrderTraversalHelper(this, result);
        return result;
    }

    public void preOrderTraversalHelper(BinaryTreeNode node, List<String> result){
        if(node!=null){
            result.add(node.data());
            preOrderTraversalHelper(node.leftNode(),result);
            preOrderTraversalHelper(node.rightNode(),result);
        }
    }





}
