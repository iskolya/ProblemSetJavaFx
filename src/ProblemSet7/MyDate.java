package ProblemSet7;
import java.util.Calendar;
public class MyDate {
    private int day;
    private int month;
    private int year;
    public static final String[] MONTHS = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };
    public static final String[] DAYS = {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
    };
    public static final int[] DAY_IN_MONTHS = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    public boolean isLeapYear(int year){
        boolean a = false;
        if(year%4==0){
            if(year%400==0){
                return true;
            }else if(year%100==0){
                return false;
            }else{
                return true;
            }
        }
        return false;
    }
    public static boolean isValidDate(int year, int month, int day){
        if(year>9999 || year<1 || month>12 || month<1 || day<1 || day>DAY_IN_MONTHS[month]){
            return false;
        }else{
            return true;
        }
    }
    public static  int getDayOfWeek(int year, int month, int day){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        return calendar.get(Calendar.DAY_OF_WEEK) ;
    }
    MyDate(int year, int month, int day){
        setDate(year, month, day);
    }
    public void setDate(int year, int month, int day){
        if (!isValidDate(year, month, day)) throw new IllegalArgumentException("Invalid year, month or day");
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if(day>31 || day<1){
            throw new IllegalArgumentException("Wrong day");
        }else{
            this.day = day;
        }
    }

    public void setMonth(int month) {
        if(month>12 || month<1){
            throw new IllegalArgumentException("Wrong month");
        }else{
            this.month = month;
        }

    }

    public void setYear(int year) {
        if (year < 1 || year > 9999){
            throw new IllegalArgumentException("Invalid year");
        }
        else{
            this.year = year;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d %s %d", DAYS[getDayOfWeek(this.year, this.month, this.day)], this.day, MONTHS[this.month - 1], this.year);
    }
    public MyDate nextDay() {

        return new MyDate(this.year, this.month, this.day + 1);
    }

    public MyDate nextMonth() {

        return new MyDate(this.year, this.month + 1, this.day);
    }

    public MyDate nextYear() {

        return new MyDate(this.year + 1, this.month, this.day);
    }

    public MyDate previousDay() {

        return new MyDate(this.year, this.month, this.day - 1);
    }

    public MyDate previousMonth() {

        return new MyDate(this.year, this.month - 1, this.day);
    }

    public MyDate previousYear() {

        return new MyDate(this.year - 1, this.month, this.day);
    }
}
