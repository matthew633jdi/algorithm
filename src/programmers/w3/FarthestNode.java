package programmers.w3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class FarthestNode {
    public static void main(String[] args) {
        int n = 6;
        int[][] edge = {
                {3, 6},
                {4, 3},
                {3, 2},
                {1, 3},
                {1, 2},
                {2, 4},
                {5, 2}
        };
        FarthestNode farthestNode = new FarthestNode();
        System.out.println(farthestNode.solution(n, edge));
    }

    public int solution(int n, int[][] edge) {
        int[] distance = new int[n + 1];
        ArrayList<Integer>[] adj = new ArrayList[n+1];

        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList();
            distance[i] = -1;
        }

        for (int i = 0; i < edge.length; i++) {
            adj[edge[i][0]].add(edge[i][1]);
            adj[edge[i][1]].add(edge[i][0]);
        }

        Queue<Integer> queue = new ArrayDeque();
        queue.offer(1);
        distance[1] = 0;

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();

            for (int adjNode: adj[currentNode]) {
                if (distance[adjNode] == -1) {
                    distance[adjNode] = distance[currentNode] + 1;
                    queue.offer(adjNode);
                }
            }
        }

        int answer = 0;
        int max = -1;

        for (int v: distance) {
            if (v > max) {
                answer = 1;
                max = v;
            } else if (v == max) {
                answer++;
            }
        }


        return answer;
    }
}
