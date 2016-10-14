package Builder;
import Domain.Location;

import org.junit.Test;

import static org.junit.Assert.*;

public class LocationBuilderTest {

    private String city;
    private String country;
    private String region;


    @Test
    public void createLocation() throws Exception {
       //hard code to set the variable
        city="city";
        country="country";
        region="region";

        Location location;

        LocationBuilder loc=new LocationBuilder();
        location=loc.createLocation(city,country,region);


        System.out.println(location.toString());

        assertEquals(location.getCity(),city);
        assertEquals(location.getCountry(),country);
        assertEquals(location.getRegion(),region);

    }

}