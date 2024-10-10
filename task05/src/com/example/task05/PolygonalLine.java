package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private Point[] Points = new Point[0];

    public void setPoints(Point[] points) {
        Point[] newArrPoints = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            newArrPoints[i] = new Point(points[i].getX(), points[i].getY());
        }
        this.Points=newArrPoints;
    }

    public void addPoint(Point point) {
            Point[] temp = new Point[Points.length + 1];
            System.arraycopy(Points, 0, temp, 0, Points.length);
            temp[temp.length - 1] = point;
            setPoints(temp);
    }

    public void addPoint(double x, double y) {
        Point point = new Point(x, y);
        addPoint(point);
    }

    public double getLength() {
        double lenght = 0;
        for (int i = 0; i < this.Points.length - 1; i++){
            lenght += Points[i].getLength(Points[i + 1]);
        }
        return lenght;
    }

}
