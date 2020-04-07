package com.algorithm.askar.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int K) {
        int arr[][] = new int[K][2];
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Point> queue = new PriorityQueue<>((x, y) -> x.distance - y.distance);
        Point point;
        for (int i = 0; i < points.length; i++) {
            point = new Point(points[i][0], points[i][1]);
            point.distance = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            queue.add(point);
        }
        for (int i = 0; i < K; i++) {
            point = queue.poll();
            arr[i][0] = point.x;
            arr[i][1] = point.y;
        }
        return arr;
    }

    static class Point {
        int x;
        int y;
        int distance;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
