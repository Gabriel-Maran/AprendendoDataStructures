package AprendendoTree.exercicios.dominio;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
    }

    public void add(Node toAdd) {
        if (this.root == null) {
            this.root = toAdd;
            return;
        }
        addHelper(root, toAdd);
    }

    private Node addHelper(Node root, Node toAdd) {
        if (root == null) {
            root = toAdd;
        } else {
            if (toAdd.data >= root.data) {
                root.right = addHelper(root.right, toAdd);
            } else {
                root.left = addHelper(root.left, toAdd);
            }
        }
        return root;
    }

    public void printInOrder() {
        inOrderHelper(root);
    }

    private void inOrderHelper(Node root) {
        if (root == null) {
            return;
        }
        inOrderHelper(root.left);
        System.out.println(root.data);
        inOrderHelper(root.right);
    }

    public boolean search(int data) {
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return searchHelper(root.left, data);
        } else {
            return searchHelper(root.right, data);
        }
    }

    public void remove(int data) {
        if (search(data)) {
            removeHelper(root, data);
        } else {
            System.out.println(data + " não encontrado");
        }
    }

    private Node removeHelper(Node root, int data) {
        if (root == null) {
            return root;
        } else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        } else if (data > root.data) {
            root.right = removeHelper(root.right, data);
        } else {
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.right != null) {
                root.data = sucessor(root);
                root.right = removeHelper(root.right, root.data);
            } else {
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }

    private int sucessor(Node root) {
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    private int predecessor(Node root) {
        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }


}
