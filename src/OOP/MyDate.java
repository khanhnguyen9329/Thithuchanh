package OOP;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public int getMonth() {
        return month;
    }

    public MyDate(int d, int m, int y) {
        if (d >= 1 && d <= 31) {
            this.day = d;
        } else {
            this.day = 1;
        }
        if (m >= 1 && m <= 12) {
            this.month = m;
        } else {
            this.month = 1;
        }
        if (y >= 0) {
            this.year = y;
        } else {
            this.year = 1;
        }


    }

    public int getDay() {
        return this.day;
    }
    public void setDay(int a){
        if (a >=1 && a <=31){
            this.day = a;
        }else {
            this.day=1;
        }

    }
}


