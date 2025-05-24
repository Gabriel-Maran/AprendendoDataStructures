package AprendendoAdjency.teste;

import AprendendoAdjency.dominio.GraphMatrix;
import AprendendoAdjency.dominio.Node;

public class GraphMatrixTeste01 {
    //To check an edge, the complexity is O(1) in runtime
    //The space complexity is O(v²), because its an two-dimensional array
    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(5);
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        System.out.println(graph.checkEdge(0,1));
    }
}
