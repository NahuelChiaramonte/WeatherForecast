package Builder;
import Domain.*;

import org.junit.Test;

import static org.junit.Assert.*;


public class ActualDayBuilderTest {

    private String distance;
    private String pressure;
    private String speed;
    private String temperature;


    @Test
    public void createActualDay() throws Exception {

        //hard code to set the variable
        distance="distance";
        pressure="pressure";
        speed="speed";
        temperature="temperature";

        ActualDay actualday;

        ActualDayBuilder AD=new ActualDayBuilder();
        actualday=AD.createActualDay(distance,pressure,speed,temperature);

        System.out.println(actualday.toString());

        assertEquals(actualday.getDistance(),distance);
        assertEquals(actualday.getPressure(),pressure);
        assertEquals(actualday.getSpeed(),speed);
        assertEquals(actualday.getTemperature(),temperature);

    }

}