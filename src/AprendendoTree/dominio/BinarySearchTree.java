package AprendendoTree.dominio;

public class BinarySearchTree {
    Node root;

    public void insert(Node node) {
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node) {

        int data = node.data;

        if (root == null) {
            root = node;
            return root;
        } else if (data < root.data) {
            root.left = insertHelper(root.left, node);
        } else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    public void display() {
        displayHelper(root);
    }

    private void displayHelper(Node root) {
        if (root != null) {
            displayHelper(root.left);//Mostrra os numeros que a tree possui, em ordem crescente
            System.out.println(root.data);
            displayHelper(root.right);
//            displayHelper(root.right); // Mostra em ordem decrescente
//            System.out.println(root.data);
//            displayHelper(root.left);
        }
    }

    public boolean search(int data) {
        return serachHelper(root, data);
    }

    private boolean serachHelper(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return serachHelper(root.left, data);
        } else {
            return serachHelper(root.right, data);
        }
    }

    public void remove(int data) {
        if (search(data)) {
            removeHelper(root, data);
        } else {
            System.out.println(data + " could not be find");
        }
    }

    private Node removeHelper(Node root, int data) {
        if (root == null) {
            return root;
        } else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        } else if (data > root.data) {
            root.right = removeHelper(root.right, data);
        }else{
            if(root.left == null && root.right == null){
                root = null;
            }else if(root.right != null){
                root.data = sucessor(root);
                root.right = removeHelper(root.right, root.data);
            }else{
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }

    private int sucessor(Node root) {//procura o menor valor da right child do node
        root = root.right;
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }

    private int predecessor(Node root) {//procura o maior valor da left child do node
        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }
}
