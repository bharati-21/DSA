import  java.util.*;
public class Graph {
    List<List<Integer>> adjacencyList;
    int vertices;

    Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>();

        for(int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int u, int v, boolean isBidirectional) {
        adjacencyList.get(u).add(v);
        if(isBidirectional) {
            adjacencyList.get(v).add(u);
        }
    }

    void printAdjacencyList() {
        for(int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            System.out.println(adjacencyList.get(i));
        }
    }

    void traverseBFS(int startNode) {
        Queue<Integer> nodes = new LinkedList<>();
        nodes.add(startNode);
        boolean[] visited = new boolean[vertices];
        visited[startNode] = true;

        while(!nodes.isEmpty()) {
            int currNode = nodes.poll();
            System.out.print(currNode + " ");

            for(int neighbor: adjacencyList.get(currNode)) {
                if(!visited[neighbor]) {
                    nodes.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
}
