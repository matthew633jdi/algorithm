package programmers.w2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Network {

    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };
        Network network = new Network();
        System.out.println(network.solution2(n, computers));
    }

    private boolean[] visited;
    private int[][] network;

    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        network = computers;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                search(i);
                answer++;
            }
        }

        return answer;
    }

    private void search(int idx) {
        visited[idx] = true;

        for (int i = 0; i < network[idx].length; i++) {
            if (i != idx && network[idx][i] == 1 && !visited[i]) {
                search(i);
            }
        }
    }

    public int solution1(int n, int[][] computers) {
        int answer = 0;
        List<Integer>[] adj = new List[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < computers.length; i++) {
            for (int j = 0; j < computers[i].length; j++) {
                if (i != j && computers[i][j] == 1) {
                    adj[i].add(j);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, adj);
                answer++;
            }
        }

        return answer;
    }

    private void dfs(int i, List<Integer>[] adj) {
        visited[i] = true;
        for (Integer node : adj[i]) {
            if (!visited[node]) {
                dfs(node, adj);
            }
        }
    }

    public int solution2(int n, int[][] computers) {
        int answer = 0;
        List<Integer>[] adj = new List[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < computers.length; i++) {
            for (int j = 0; j < computers[i].length; j++) {
                if (i != j && computers[i][j] == 1) {
                    adj[i].add(j);
                }
            }
        }

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                stack.push(i);
                visited[i] = true;

                while (!stack.isEmpty()) {
                    int idx = stack.pop();

                    for (int node : adj[idx]) {
                        if (!visited[node]) {
                            visited[node] = true;
                            stack.push(node);
                        }
                    }
                }
                answer++;
            }
        }

        return answer;
    }
}