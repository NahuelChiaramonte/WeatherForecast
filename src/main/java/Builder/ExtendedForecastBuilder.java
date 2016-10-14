package Builder;



import Domain.ExtendedForecast;

import java.text.SimpleDateFormat;

public class ExtendedForecastBuilder {

    private int code;
    private SimpleDateFormat date;
    private String day;
    private int high;
    private int low;
    private String text;

    public ExtendedForecastBuilder(){

    }

    public ExtendedForecastBuilder code(int code){
        this.code=code;
        return this;
    }


    public ExtendedForecastBuilder date(SimpleDateFormat date){
        this.date=date;
        return this;
    }

    public ExtendedForecastBuilder day(String day){
        this.day=day;
        return this;
    }

    public ExtendedForecastBuilder high(int high){
        this.high=high;
        return this;
    }

    public ExtendedForecastBuilder low(int low){
        this.low=low;
        return this;
    }

    public ExtendedForecastBuilder text(String text){
        this.text=text;
        return this;
    }

    public ExtendedForecast createExtendedForecast(int code,SimpleDateFormat date,String day, int high, int low, String text){
        return new ExtendedForecast(code,date,day,high,low,text);
    }


}
