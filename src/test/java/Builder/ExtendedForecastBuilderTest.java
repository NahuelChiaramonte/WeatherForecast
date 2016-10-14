package Builder;
import Domain.*;

import org.junit.Test;

import java.text.SimpleDateFormat;

import static org.junit.Assert.*;


public class ExtendedForecastBuilderTest {

    private int code;
    private SimpleDateFormat date;
    private String day;
    private int high;
    private int low;
    private String text;

    @Test
    public void createExtendedForecast() throws Exception {

        code=1;
        SimpleDateFormat date = new SimpleDateFormat("25/02/205");
        day="monday";
        high=30;
        low=20;
        text="text";

        ExtendedForecast extendedForecast;

        ExtendedForecastBuilder AD=new ExtendedForecastBuilder();
        extendedForecast=AD.createExtendedForecast(code,date,day,high,low,text);

        System.out.println(extendedForecast.toString());

        assertEquals(extendedForecast.getCode(),code);
        assertEquals(extendedForecast.getDate(),date);
        assertEquals(extendedForecast.getDay(),day);
        assertEquals(extendedForecast.getHigh(),high);
        assertEquals(extendedForecast.getLow(),low);
        assertEquals(extendedForecast.getText(),text);
    }

}