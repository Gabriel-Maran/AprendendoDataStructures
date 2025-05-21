package AprendendoAdjencyMatrix.dominio;

public class Node {
    char data;

    public Node(char data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return ""+data;
    }
}
