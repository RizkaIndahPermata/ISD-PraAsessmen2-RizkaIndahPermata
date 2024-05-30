public class MainInggris {
    public static void main(String[] args) {
        System.out.println("Pre-Assessment Inggris");
        AdjacencyList adjacencyList = new AdjacencyList();

        adjacencyList.addEdge("London", "Salisbury");
        adjacencyList.addEdge("London", "Birmingham");
        
        adjacencyList.addEdge("Salisbury", "Bristol");
        adjacencyList.addEdge("Salisbury", "London");

        adjacencyList.addEdge("Bristol", "Salisbury");
        adjacencyList.addEdge("Bristol", "Birmingham");
        
        adjacencyList.addEdge("Birmingham", "Cardiff");
        adjacencyList.addEdge("Birmingham", "Bristol");
        adjacencyList.addEdge("Birmingham", "London");
        adjacencyList.addEdge("Birmingham", "Manchester");
        adjacencyList.addEdge("Birmingham", "Kingston");

        adjacencyList.addEdge("Cardiff", "Birmingham");

        adjacencyList.addEdge("Manchester", "Birmingham");
        adjacencyList.addEdge("Manchester", "Kingston");
        adjacencyList.addEdge("Manchester", "Liverpool");
        adjacencyList.addEdge("Manchester", "Newcastle");
        adjacencyList.addEdge("Manchester", "Glasgow");

        adjacencyList.addEdge("Kingston", "Manchester");
        adjacencyList.addEdge("Kingston", "Birmingham");
        adjacencyList.addEdge("Kingston", "Newcastle");

        adjacencyList.addEdge("Liverpool", "Manchester");

        adjacencyList.addEdge("Newcastle", "Manchester");
        adjacencyList.addEdge("Newcastle", "Kingston");
        adjacencyList.addEdge("Newcastle", "Edinburgh");

        adjacencyList.addEdge("Edinburgh", "Newcastle");
        adjacencyList.addEdge("Edinburgh", "Glasgow");

        adjacencyList.addEdge("Glasgow", "Edinburgh");
        adjacencyList.addEdge("Glasgow", "Manchester");

        BFS bfs = new BFS(adjacencyList);

        System.out.println("BFS dari London:");
        bfs.search("London");

        System.out.println();

        System.out.println("DFS dari London:");

        DFS dfs = new DFS(adjacencyList);

        dfs.search("London");

        System.out.println();
    }
}