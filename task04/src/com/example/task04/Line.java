package com.example.task04;

public class Line {
    private Point FirstPoint;
    private Point SecondPoint;
    public Line (Point p1, Point p2){
        FirstPoint = p1;
        SecondPoint = p2;
    }

    public Point getFirstPoint() {
        return FirstPoint;
    }

    public Point getSecondPoint() {
        return SecondPoint;
    }

    public String ToString(){
        return FirstPoint.toString() + " - " + SecondPoint.toString();
    }

    public boolean isCollinearLine(Point p){
//        x1*y2 = x2*y1 проверка на коллинеарность
        int coordXFisrt = SecondPoint.x - FirstPoint.x, coordYFirst = SecondPoint.y - FirstPoint.y;
        int coordXSecond = p.x - FirstPoint.x, coordYSecond = p.y - FirstPoint.y;
        return coordXFisrt * coordYSecond == coordXSecond * coordYFirst;
    }
}
