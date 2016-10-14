package Builder;

import Domain.*;
import org.junit.Test;

import static org.junit.Assert.*;


public class AtmosphereBuilderTest {
    private int humidity;
    private double pressure;
    private int rising;
    private float visibility;

    @Test
    public void createAtmosphere() throws Exception {

        humidity=20;
        pressure=12.5;
        rising=12;
        visibility=12223;

        Atmosphere atmosphere;

        AtmosphereBuilder AD=new AtmosphereBuilder();
        atmosphere=AD.createAtmosphere(humidity,pressure,rising,visibility);

        System.out.println(atmosphere.toString());

        assertEquals(atmosphere.getHumidity(),humidity);
  //      assertEquals(atmosphere.getPressure(),pressure);
        assertEquals(atmosphere.getRising(),rising);
   //     assertEquals(atmosphere.getVisibility(),visibility);

    }

}