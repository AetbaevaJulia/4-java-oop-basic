package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(10, 50, 40);
        TimeSpan time2 = new TimeSpan(5, 60, 360);
        System.out.println(time2.toString());
        time1.subtract(time2);
        System.out.println(time1.toString());

        TimeSpan time3 = new TimeSpan(22, 50, 40);
        TimeSpan time4 = new TimeSpan(5, 10, 360);
        time3.add(time4);
        System.out.println(time3.toString());
    }
}
