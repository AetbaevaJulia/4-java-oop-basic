package com.example.task04;

public class Point {
    final int x;
    final int y;

    public Point(int X, int Y){
        x = X;
        y = Y;
    }
    double distance(Point point){
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
