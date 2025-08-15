package EXPS;

//import java.util.*;

public class DistanceVectorRouting {
    public static void main(String[] args) {
        int[][] graph = {
            {0, 2, 5, Integer.MAX_VALUE},
            {2, 0, 3, 1},
            {5, 3, 0, 2},
            {Integer.MAX_VALUE, 1, 2, 0}
        };
        int nodes = graph.length;
        int[][] dist = new int[nodes][nodes];

        // Initialize distance table
        for (int i = 0; i < nodes; i++) {
            System.arraycopy(graph[i], 0, dist[i], 0, nodes);
        }

        // Distance Vector Algorithm
        boolean updated;
        do {
            updated = false;
            for (int i = 0; i < nodes; i++) {
                for (int j = 0; j < nodes; j++) {
                    for (int k = 0; k < nodes; k++) {
                        if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE) {
                            if (dist[i][j] > dist[i][k] + dist[k][j]) {
                                dist[i][j] = dist[i][k] + dist[k][j];
                                updated = true;
                            }
                        }
                    }
                }
            }
        } while (updated);

        // Print routing tables
        for (int i = 0; i < nodes; i++) {
            System.out.println("Routing Table for Node " + (char) ('A' + i) + ":");
            for (int j = 0; j < nodes; j++) {
                System.out.println("  To " + (char) ('A' + j) + ": " + (dist[i][j] == Integer.MAX_VALUE ? "∞" : dist[i][j]));
            }
            System.out.println();
        }
    }
}