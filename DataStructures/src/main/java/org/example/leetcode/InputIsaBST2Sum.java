package src.main.java.org.example.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class InputIsaBST2Sum {

    public boolean findTarget(org.example.leetcode.TreeNode root, int k) {
    Set<Integer> result = new HashSet<>();
        return dfsWithSet(root, k, result);
    }

    public boolean dfsWithSet(org.example.leetcode.TreeNode node, int k, Set<Integer> seen){
        if(node==null) return false;
        int complement =  k - node.val;
        if(seen.contains(complement)){
            return true;
        }

        seen.add(node.val);
        return dfsWithSet(node.right, k, seen) || dfsWithSet(node.left, k, seen);
    }
}
