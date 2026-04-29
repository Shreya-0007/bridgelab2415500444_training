import java.util.*;

class DFS {
    static void dfs(int node, boolean[] visited, List<List<Integer>> adj) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, adj);
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.addEdge(2,5);

        boolean[] visited = new boolean[6];
        dfs(0, visited, g.adj);
    }
}
