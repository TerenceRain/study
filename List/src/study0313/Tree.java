package study0313;



class TreeNode{
    String val;
    TreeNode left;
    TreeNode right;

    public TreeNode(String val){
        this.val = val;
    }
}

public class Tree {
    public static TreeNode creatTree(){
        TreeNode a = new TreeNode("A");
        TreeNode b = new TreeNode("B");
        TreeNode c = new TreeNode("C");
        TreeNode d = new TreeNode("D");
        TreeNode e = new TreeNode("E");
        TreeNode f = new TreeNode("F");
        TreeNode g = new TreeNode("G");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        c.right = f;

        return a;

    }

    public static void main(String[] args) {
        TreeNode root = creatTree();
//        preOrder(root);
//        inOrder(root);
        postOrder(root);
    }

    //前序遍历
    public static void preOrder(TreeNode root){
        if (root == null){
            return;
        }
        System.out.print(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    //中序遍历
    public static void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val);
        inOrder(root.right);
    }
    public static void postOrder(TreeNode root){
        if (root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print     (root.val);
    }
}
