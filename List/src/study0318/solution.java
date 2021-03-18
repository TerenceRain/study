package study0318;

import java.util.ArrayList;
import java.util.List;

public class solution {
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
    public static TreeNode build() {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        c.right = f;
        return a;
    }
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null){
            return null;
        }
        if (pRootOfTree.left == null && pRootOfTree.right == null){
            return pRootOfTree;
        }
        TreeNode leftHead = Convert(pRootOfTree.left);
        TreeNode leftTail = leftHead;
        while (leftTail != null && leftTail.right != null){
            leftTail = leftTail.right;
        }
        if (leftHead != null){
            leftTail.right = pRootOfTree;
            pRootOfTree.left = leftTail;
        }

        TreeNode rightHead = Convert(pRootOfTree.right);
        if (rightHead != null){
            rightHead.left = pRootOfTree;
            pRootOfTree.right = rightHead;
        }
        return leftHead != null ? leftHead : pRootOfTree;
    }
    public static void main(String[] args) {
        TreeNode root = build();
    }
    public TreeNode lca = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            return null;
        }
        find(root, p, q);
        return lca;
    }

    private boolean find(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            return false;
        }
        int mid = (root == p || root == q) ? 1 : 0;
        int left = find(root.left, p, q) ? 1 : 0;
        int right = find(root.left, p, q) ? 1 : 0;
        if (mid + left + right == 2){
            lca = root;
        }
        return (left + right + mid) > 0;
    }

    public List<List<Integer>> result = null;
    public List<List<Integer>> levelOrder(TreeNode root) {//分层遍历
        result = new ArrayList<List<Integer>>();
        if (root == null){
            return result;
        }
        helper(root, 0);
        return result;
    }

    private void helper(TreeNode root, int level) {
        if (level == result.size()){
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val);
        if (root.left != null){
            helper(root.left, level + 1);
        }
        if (root.right != null){
            helper(root.right, level + 1);
        }
    }
}
