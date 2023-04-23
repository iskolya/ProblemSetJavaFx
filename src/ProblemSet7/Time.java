package ProblemSet7;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour <0 || hour >23){
            throw new IllegalArgumentException("Wrong hour");
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute <0 || minute>60){
            throw new IllegalArgumentException("Wrong minute");
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(minute <0 || minute>59){
            throw new IllegalArgumentException("Wrong minute");
        }
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    public Time nextSecond(){
        if(second==59) {
            if(minute==59){
                if(hour==23){
                    hour = 0;
                    minute = 0;
                    second = 0;
                }else{
                    setTime(++hour, minute,second);
                    return this;
                }
            }else{
                setTime(hour, ++minute, second);
                return this;
            }
        }else{
            setTime(hour, minute, ++second);
            return this;
        }
        return this;
    }
    public Time previousSecond(){
        if(second==0){
            if(minute==0){
                if(hour==0){
                    hour = 23;
                    minute = 59;
                    second = 59;
                    return this;
                }else{
                    minute = 59;
                    second =59;
                    setTime(--hour, minute, second);
                    return this;
                }
            }else{
                second = 59;
                setTime(hour, --minute, second);
                return this;
            }

        }else{
            setTime(hour, minute, --second);
        }
        return this;
    }
}
