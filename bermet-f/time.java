package example.com.Time;


public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time ( int hour , int minute , int second ) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour ( ) {
        return hour;
    }

    public int getMinute ( ) {
        return minute;
    }

    public int getSecond ( ) {
        return second;
    }

    public void setHour ( int hour ) {
        this.hour = hour;
    }

    public void setMinute ( int minute ) {
        this.minute = minute;
    }

    public void setSecond ( int second ) {
        this.second = second;
    }

    public void setTime ( int hour , int minute , int second ) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString ( ) {
        if ( getHour () >= 0 && getHour () < 24 &&
                getMinute () >= 0 && getMinute () < 60 &&
                getSecond () >= 0 && getSecond () < 60 ) {
            return "" + hour +
                    ":" + minute +
                    ":" + second;
        }
        public String nextSecond ( ) {
            return "" + hour +
                    ":" + minute +
                    ":" + (second + 1);

        }
        public String previousSecond () {
            return "" + hour +
                    ":" + minute +
                    ":" + (second - 1);
        }

    }
}
