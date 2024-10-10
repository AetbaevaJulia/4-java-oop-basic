package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {
    private final double X;
    private final double Y;

    public Point(double x, double y) {
        X = x;
        Y = y;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

     public double getLength(Point point) {
        return Math.sqrt(Math.pow(point.X - this.X, 2) + Math.pow(point.Y - this.Y, 2));
    }

}
