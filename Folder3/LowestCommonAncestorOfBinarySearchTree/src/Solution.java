/*
Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

Given binary search tree:  root = [6,2,8,0,4,7,9,null,null,3,5]

        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5
Example 1:

Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
Output: 6
Explanation: The LCA of nodes 2 and 8 is 6.
Example 2:

Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
Output: 2
Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself
             according to the LCA definition.
 */

public class Solution {
    private static boolean found;
    private TreeNode result;
    private int minValue;
    private int maxValue;

    public Solution(){
        found = false;
        result = null;
        minValue = -1;
        maxValue = -1;
    }

    public void helper(TreeNode root, TreeNode p, TreeNode q){
        if(root!=null){
            if( (root.val >= minValue && root.val<= maxValue)  || (root.val==minValue) || (root.val==maxValue)){
                if(result==null)
                    result = root;
            }
            helper(root.left,p,q);
            helper(root.right,p,q);
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        minValue = Math.min(p.val,q.val);
        maxValue = Math.max(p.val, q.val);
        helper(root,p,q);
        return result;
    }
}
