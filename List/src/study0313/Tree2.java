package study0313;
class Node {
    String val;
    Node left;
    Node right;

    public Node(String val) {
        this.val = val;
    }
}
public class Tree2 {
    public static Node build() {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        c.right = f;
        return a;
    }

    // 先序遍历
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        // 访问根节点. 此处的访问就是打印操作
        System.out.print(root.val);
        // 递归遍历左子树
        preOrder(root.left);
        // 递归遍历右子树
        preOrder(root.right);
    }

    // 中序遍历
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        // 先递归处理左子树
        inOrder(root.left);
        // 再访问根节点
        System.out.print(root.val);
        // 最后递归处理右子树
        inOrder(root.right);
    }

    // 后序遍历
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        // 先递归处理左子树
        postOrder(root.left);
        // 再递归处理右子树
        postOrder(root.right);
        // 最后打印根节点
        System.out.print(root.val);
    }

    public static void main(String[] args) {
        Node root = build();
        preOrder(root);
//        inOrder(root);
//        postOrder(root);
    }
}
