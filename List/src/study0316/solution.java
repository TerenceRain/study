package study0316;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
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
public class solution {
    public static TreeNode creatTree() {
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
//        c.left = e;
//        e.left = g;
//        e.right = f;

        return a;

    }
    public static boolean isCompleteTree(TreeNode root){//判断完全二叉树
        if (root == null){
            return  true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        boolean isLevel2 = false;
        queue.offer(root);
        while (true) {
            TreeNode cur = queue.poll();
            if (cur == null) {
                break;
            }
            if (isLevel2) {
                if (root.left != null && root.right != null) {
                    queue.offer(root.left);
                    queue.offer(root.right);
                } else if (root.left == null && root.right != null) {
                    return false;
                } else if (root.left != null && root.right == null) {
                    isLevel2 = true;
                    queue.offer(root.left);
                }else{
                    isLevel2 = true;
                }
            }else {
                if (root.left != null && root.right != null){
                    return false;
                }
            }
        }
return true;

    }
    public static void levelOrderTraversal(TreeNode root) {//实现
        if (root == null) {
            return;
        }
        Queue queue = new LinkedList();
        queue.offer(root);
        while (true) {
            TreeNode cur = (TreeNode) queue.poll();
            if (cur == null) {
                break;
            }

            System.out.println(cur.val);
            if (cur.left != null) {
                queue.offer(cur.left);

            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }
        public static boolean isSameTree (TreeNode p, TreeNode q){
            if (p == null && q == null) {
                return true;
            }
            if (p == null || q == null) {
                return false;
            }
            if (p == q && p.left == null && p.right == null && q.left == null && q.right == null) {
                return true;
            }
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        public static int maxDepth (TreeNode root){
            if (root == null) {
                return 0;
            }
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
        public static boolean isBalanced (TreeNode p){
            if (p == null) {
                return true;
            }
            if (maxDepth(p.left) - maxDepth(p.right) > 1 || maxDepth(p.left) - maxDepth(p.right) < -1) {
                return false;
            }
//        return true;
            return isBalanced(p.left) && isBalanced(p.right);
        }
        public static void main (String[]args){
            TreeNode p = creatTree();
            TreeNode q = creatTree();
//        System.out.println(isSameTree(p, q));
//        System.out.println(maxDepth(p));
//            System.out.println(isBalanced(p));
//            levelOrderTraversal(p);
            System.out.println(isCompleteTree(p));
        }

    }
