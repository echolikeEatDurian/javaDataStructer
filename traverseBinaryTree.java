public class traverseBinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode node1 = new BinaryTreeNode("吴用", 1);
        BinaryTreeNode node2 = new BinaryTreeNode("宋江", 2);
        BinaryTreeNode node3 = new BinaryTreeNode("林冲", 3);
        BinaryTreeNode node4 = new BinaryTreeNode("卢俊义", 4);
        BinaryTreeNode node5 = new BinaryTreeNode("晁盖", 5);

        BinaryTree T = new BinaryTree(node1);
        node1.leftchild = node2;
        node1.rightchild = node3;
        node3.leftchild = node4;
        node4.rightchild = node5;
        System.out.println("前序遍历");
        T.root.preOrder();

        System.out.println();
        System.out.println("中序遍历");
        T.root.midOrder();

        System.out.println();
        System.out.println("后序遍历");
        T.root.postOrder();

    }

}

class BinaryTree {
    // 根节点属性
    public BinaryTreeNode root;

    public BinaryTree(BinaryTreeNode root) {
        this.root = root;
    }
}

class BinaryTreeNode {
    public String name;
    public int num;
    public BinaryTreeNode leftchild;
    public BinaryTreeNode rightchild;

    // 构造方法
    public BinaryTreeNode(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", num=" + num + "]";
    }

    // 遍历方法

    public void preOrder() {
        System.out.print(this + "==>");
        if (this.leftchild != null) {
            this.leftchild.preOrder();
        }
        if (this.rightchild != null) {
            this.rightchild.preOrder();
        }
    }

    public void midOrder() {
        if (this.leftchild != null) {
            this.leftchild.midOrder();
        }
        System.out.print(this + "==>");
        if (this.rightchild != null) {
            this.rightchild.midOrder();
        }
    }

    public void postOrder() {
        if (this.leftchild != null) {
            this.leftchild.midOrder();
        }
        if (this.rightchild != null) {
            this.rightchild.midOrder();
        }
        System.out.print(this + "==>");
    }

    public void deleteNode(int num, BinaryTreeNode rootnode) {
        // 先找到这个节点就要找到他的父节点

    }

    public void addNode(int num, BinaryTreeNode newnode) {

    }

}
