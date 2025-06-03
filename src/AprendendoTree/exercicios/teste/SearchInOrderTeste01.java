package AprendendoTree.exercicios.teste;

import AprendendoTree.exercicios.dominio.BinarySearchTree;
import AprendendoTree.exercicios.dominio.Node;

public class SearchInOrderTeste01 {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(new Node(6));
        tree.add(new Node(3));
        tree.add(new Node(9));
        tree.add(new Node(1));
        tree.add(new Node(2));
        tree.add(new Node(-1));
        tree.add(new Node(0));

        tree.printInOrder();
        tree.remove(1);
        tree.printInOrder();
    }
}
