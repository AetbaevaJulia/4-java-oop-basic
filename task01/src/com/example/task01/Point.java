package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(){ }
    public Point(int X, int Y){
        x = X;
        y = Y;
    }

    void flip() {
        int temp = x;
        x = -y;
        y = -temp;
    }

    double distance(Point point){
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
