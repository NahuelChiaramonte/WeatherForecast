package Domain;
import Builder.*;

import java.util.*;


public class Location {

    private String city;
    private String country;
    private String region;

    public Location(String city,String country,String region){
        this.city=city;
        this.country=country;
        this.region=region;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return "City: " +city + "Country: " +country + "Region: " +region ;
    }
}

