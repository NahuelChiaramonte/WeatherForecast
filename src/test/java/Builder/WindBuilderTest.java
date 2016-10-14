package Builder;
import Domain.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class WindBuilderTest {

    private int chill;
    private int direction;
    private float speed;

    @Test
    public void createWind() throws Exception {
        //hard code to set the variable
        chill=10;
        direction=100;
        speed=111;

        Wind wind;

        WindBuilder win=new WindBuilder();
        wind=win.createWind(chill,direction,speed);

        System.out.println(wind.toString());

        assertEquals(wind.getChill(),chill);
        assertEquals(wind.getDirection(),direction);
    //    assertEquals(wind.getSpeed(),speed);


    }

}