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
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> ans1=new ArrayList<>();
        List<Integer> ans2=new ArrayList<>();
        leaf(ans1,root1);
        leaf(ans2,root2);
        System.out.println(ans1);
        System.out.println(ans2);
       

        return (ans1.equals(ans2)); 
    }
    public void leaf(List<Integer> tree,TreeNode root){
        if(root==null)return;
        if(root.left==null && root.right==null){
            tree.add(root.val);
            
        }
        
         leaf(tree,root.right);
          leaf(tree,root.left);
    }
}