public class GraphsRepresentation {
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1, true);
        graph.addEdge(0, 4, true);
        graph.addEdge(2, 1, true);
        graph.addEdge(3, 4, true);
        graph.addEdge(4, 5, true);
        graph.addEdge(2, 3, true);
        graph.addEdge(3, 5, true);

        graph.printAdjacencyList();

        graph.traverseBFS(0);
    }
}