package ProblemSet7;

public class MyTime {
    private int hour;
    private int minute;
    private int second;
    public MyTime(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    public MyTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public void setTime(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void setHour(int hour) {
        if(hour>23 || hour<1){
            throw new IllegalArgumentException("Wrong hour");
        }else{
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if(minute>59 || minute<0){
            throw new IllegalArgumentException("Wrong minute");
        }else{
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        if(second>59 || second<0){
            throw new IllegalArgumentException("Wrong second");
        }else{
            this.second = second;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    public MyTime nextSecond(){
        if(second == 59) {
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
    public MyTime nextMinute(){
        if(minute==59){
            if(hour==23){
                minute = 0;
                hour = 0;
            }else{
                hour +=1;
                minute =0;
                return this;
            }
        }else{
            minute+=1;
            return this;
        }
        return this;
    }
    public MyTime nextHour(){
        if(hour==23){
            hour=0;
        }else{
            hour+=1;
            return this;
        }
        return this;
    }
    public MyTime previousSecond(){
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
    public MyTime previousMinute(){
        if(minute==0){
            if(hour==0){
                hour=23;
                minute=59;
            }else{
                minute =59;
                return this;
            }
        }else{
            minute-=1;
            return this;
        }
        return this;
    }
    public MyTime previousHour(){
        if(hour==0){
            hour=23;
        }else{
            hour-=1;
            return this;
        }
        return this;
    }
}
