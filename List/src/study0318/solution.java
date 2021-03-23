package study0318;

import com.sun.xml.internal.ws.api.pipe.ServerTubeAssemblerContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    public int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder){
        index = 0;
        List<Integer> inorderList = new ArrayList<>();
        for (int x:inorder) {
            inorderList.add(x);
        }
        return _buildTree(preorder, inorderList);
    }

    private TreeNode _buildTree(int[] preorder, List<Integer> inorder) {
        if (!inorder.isEmpty()){
            return null;
        }
        TreeNode root =  new TreeNode(preorder[index]);
        index++;
        int pos = inorder.indexOf(root.val);
        root.left = _buildTree(preorder, inorder.subList(0, pos));
        root.right = _buildTree(preorder, inorder.subList(pos + 1, inorder.size()));
        return root;
    }



    public StringBuilder stringBuilder = null;
    public String tree2str(TreeNode t){
        stringBuilder = new StringBuilder();
        if (t == null){
            return "";
        }
        _tree2str(t);
        stringBuilder.deleteCharAt(0);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    private void _tree2str(TreeNode root) {
        if (root == null){
            return;
        }
        stringBuilder.append("(");
        stringBuilder.append(root.val);
        _tree2str(root.left);
        if (root.left == null && root.right != null){
            stringBuilder.append("()");
        }
        _tree2str(root.right);
        stringBuilder.append(")");
    }


    public static void preOrderNoR(TreeNode root){//非递归先序遍历
        if (root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            System.out.println(cur.val);
            if (cur.right != null){
                stack.push(cur.right);
            }
            if (cur.left != null){
                stack.push(cur.left);
            }
        }
    }

    public static void inOrderNoR(TreeNode root){//非递归中序遍历
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(true){
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            if (stack.isEmpty()){
                break;
            }
            TreeNode top = stack.pop();
            System.out.println(top.val);
            cur = top.right;
        }
    }

    public static void postOrderNoR(TreeNode root){
        if (root == null){
            Stack<TreeNode> stack = new Stack<>();
            TreeNode cur = root;
            TreeNode prev = null;
            while(true){
                while(cur != null){
                    stack.push(cur);
                    cur = cur.left;
                }
                if (stack.isEmpty()){
                    break;
                }
                TreeNode top = stack.peek();
                if (top.right == null || prev == top.right){
                    System.out.println(top.val);
                    stack.pop();
                    prev = top;
                }else {
                    cur = top.right;
                }
            }
        }
    }
}
