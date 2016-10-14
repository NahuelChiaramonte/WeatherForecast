package Domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Time;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;

public class ExtendedForecast {

    private int code;
    private SimpleDateFormat date;
    private String day;
    private int high;
    private int low;
    private String text;

    public ExtendedForecast(int code, SimpleDateFormat date, String day, int high, int low, String text){
        this.code=code;
        this.date=date;
        this.day=day;
        this.high=high;
        this.low=low;
        this.text=text;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setDate(SimpleDateFormat date) {
        this.date = date;
    }

    public SimpleDateFormat getDate() {
        return date;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getHigh() {
        return high;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getLow() {
        return low;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Code: " +code + "Date: " +date + "Day: " +day + "High: " +high + "Low: " +low + "Text: " +text;
    }
}
