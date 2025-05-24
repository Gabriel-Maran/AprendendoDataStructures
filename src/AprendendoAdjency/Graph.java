package AprendendoAdjency;

import java.util.ArrayList;

public class Graph {
    ArrayList<Node> nodes;
    int[][] matrix;

    public Graph(int size) {
        this.nodes = new ArrayList<>();
        this.matrix = new int[size][size];
    }
}
