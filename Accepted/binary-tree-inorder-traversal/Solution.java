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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode>s = new Stack<>();
        ArrayList<Integer>res = new ArrayList<>();
        TreeNode curr = root;
        while(true){
            while(curr!=null){
                s.push(curr);
                curr = curr.left;
            }
            if(s.isEmpty()) break;
            TreeNode temp = s.peek();
            res.add(temp.val);
            curr = temp.right;
            s.pop();
        }   
        return res;
        }
}