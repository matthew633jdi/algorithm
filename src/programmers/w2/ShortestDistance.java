package programmers.w2;

import java.util.ArrayDeque;
import java.util.Queue;

public class ShortestDistance {
    public static void main(String[] args) {
        int[][] maps = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}

        };
        ShortestDistance shortestDistance = new ShortestDistance();
        System.out.println(shortestDistance.solution(maps));
    }

    private static final int[] dx = {1, -1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};

    public int solution(int[][] maps) {
        int[][] routes = new int[maps.length][maps[0].length];

        Queue<int[]> queue = new ArrayDeque<>();
        routes[0][0] = 1;
        queue.offer(new int[]{0, 0});

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int x = point[0], y = point[1];
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= maps.length || ny < 0 || ny >= maps[0].length) continue;
                if (maps[nx][ny] == 0 || routes[nx][ny] != 0) continue;

                routes[nx][ny] = routes[x][y] + 1;
                queue.offer(new int[]{nx, ny});
            }
        }

        return routes[maps.length - 1][maps[0].length - 1] > 0 ? routes[maps.length - 1][maps[0].length - 1] : -1;
    }

    private record Point(int x, int y) {}

    public int solution1(int[][] maps) {
        int[][] routes = new int[maps.length][maps[0].length];

        Queue<Point> queue = new ArrayDeque<>();
        routes[0][0] = 1;
        queue.offer(new Point(0, 0));

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            if (current.x() == maps.length -1 && current.y() == maps[0].length - 1) {
                return routes[maps.length - 1][maps[0].length - 1];
            }

            for (int i = 0; i < 4; i++) {
                int nx = current.y() + dx[i];
                int ny = current.x() + dy[i];

                if (nx < 0 || nx >= maps.length || ny < 0 || ny >= maps[0].length) continue;
                if (maps[nx][ny] == 0 || routes[nx][ny] != 0) continue;

                routes[nx][ny] = routes[current.x()][current.y()] + 1;
                queue.offer(new Point(nx, ny));
            }
        }

        return -1;
    }
}
