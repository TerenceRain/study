package study0318;


import java.util.Scanner;

public class CreatTree {
    public static class TreeNode{
        public char val;
        public TreeNode right;
        public TreeNode left;
        public TreeNode (char val){
            this.val = val;
        }

    }

    public static void main(String[] args) {//二叉树的构建
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String line = scanner.next();
            TreeNode root = build(line);
            inorder(root);
            System.out.println();

        }
    }

    private static void inorder(TreeNode root) {
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static int index = 0;
    private static TreeNode build(String line) {
        index = 0;
        return _build(line);
    }

    private static TreeNode _build(String line) {
        char ch = line.charAt(index);
        if (ch == '#'){
            return null;
        }
        TreeNode root = new TreeNode(ch);
        index++;
        root.left = _build(line);
        index++;
        root.right = _build(line);
        return root;
    }

}
