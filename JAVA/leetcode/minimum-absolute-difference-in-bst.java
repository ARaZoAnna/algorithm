//https://leetcode.com/problems/minimum-absolute-difference-in-bst/

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
 /*
    트리 순회(재귀)
    preorder : self left right
    inorder : left self right
    postorder : left right self
    이진 검색 트리 성질 -> inorder -> 오름차순 정렬됨.
 */
class Solution {
    boolean flag;
    int min;
    int prev;
    public int getMinimumDifference(TreeNode root) {
        flag = false;
        min = Integer.MAX_VALUE;
        inOrder(root);
        return min;
    }
    public void inOrder(TreeNode root){
        if(root == null) return;

        inOrder(root.left);

        if(!flag) flag = true;
        else{
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;

        inOrder(root.right);
    }
}
