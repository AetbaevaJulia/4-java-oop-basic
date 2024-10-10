package com.example.task02;

public class TimeSpan {
    private int Hours;
    private int Minutes;
    private int Seconds;

    public TimeSpan (int hours, int minutes, int seconds){
        Hours = hours;
        Minutes = minutes;
        Seconds = seconds;
        CheckBorders();
    }

    public int getHours() {
        return Hours;
    }
    public void setHours(int hours) {
        Hours = hours;
    }

    public int getMinutes() {
        return Minutes;
    }
    public void setMinutes(int minutes) {
        Minutes = minutes;
        CheckBorders();
    }

    public int getSeconds() {
        return Seconds;
    }
    public void setSeconds (int seconds) {
        Seconds = seconds;
        CheckBorders();
    }

    void CheckBorders(){
        if (Seconds >= 60){
            Minutes += Seconds / 60;
            Seconds %= 60;
        }
        if (Minutes >= 60){
            Hours += Minutes / 60;
            Minutes %= 60;
        }
    }

    void add(TimeSpan time){
        this.Hours += time.Hours;
        this.Minutes += time.Minutes;
        this.Seconds += time.Seconds;
        CheckBorders();
    }

    private int ConvertToSeconds(TimeSpan time){
        return time.Hours * 3600 + time.Minutes * 60 + time.Seconds;
    }
    private void ConvertFromSeconds(int seconds) {
        Hours = seconds / 3600;
        seconds %= 3600;
        Minutes = seconds / 60;
        Seconds = seconds % 60;
    }
    void subtract(TimeSpan time){
        int timeThisInSecond = ConvertToSeconds(new TimeSpan(this.Hours, this.Minutes, this.Seconds));
        int timeInSecond = ConvertToSeconds(time);
        ConvertFromSeconds(timeThisInSecond - timeInSecond);
    }

    public String toString(){
        return Hours + " hours " + Minutes + " minutes " + Seconds + " seconds";
    }
}
