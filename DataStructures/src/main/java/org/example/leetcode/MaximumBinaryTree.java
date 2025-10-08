package src.main.java.org.example.leetcode;

public class MaximumBinaryTree {

    static class TreeNode {
        int val;
       TreeNode left;
       TreeNode right;

        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
     return buildTree(nums,0, nums.length-1);
    }

    private TreeNode buildTree(int[] nums, int start, int end){
        if(start>end) {
            return null;
        }
        //find max index
        int peakIndex = findMaxElement(nums, start, end);

        TreeNode root = new TreeNode(nums[peakIndex]);
        root.left = buildTree(nums, start, peakIndex-1 );
        root.right = buildTree(nums, peakIndex+1, end);
        return root;
    }

    private int findMaxElement(int[] nums, int start, int end){
        int peakIndex = start;
      for(int i=start+1; i<=end; i++){
           if(nums[i]>nums[peakIndex]){
               peakIndex = i;
           }
      }
      return peakIndex;
    }
}
