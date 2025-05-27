package AprendendoBreadthFirstSearch.teste;

import AprendendoBreadthFirstSearch.dominio.Graph;
import AprendendoBreadthFirstSearch.dominio.Node;

public class GraphTeste01 {
    //To check an edge, the complexity is O(1) in runtime
    //The space complexity is O(v²), because its an two-dimensional array
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.breadthFirstSearch(1);
    }
}
