package org.example.binaryTree;

import org.example.binaryTree.BinaryTreeNode;

import java.util.List;

public class TreeTraversal {



    public static void main(String[] args) {

        var root = BinaryTreeNode.withChildren("A",
                BinaryTreeNode.withChildren("B",
                        BinaryTreeNode.leaf("D"), BinaryTreeNode.leaf("E")
                        ), BinaryTreeNode.leaf("C"));

        List<String> li = root.inOrderTraversal();
        System.out.println(li);

        List<String> li2 = root.preOrderTraversal();
        System.out.println(li2);
    }


    }
