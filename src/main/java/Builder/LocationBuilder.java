package Builder;
import Domain.*;

public class LocationBuilder {

    public String city;
    public String country;
    public String region;

    public LocationBuilder(){
        this.city=city;
        this.country=country;
        this.region=region;
    }

    public LocationBuilder city(String city){
        this.city=city;
        return this;
    }

    public LocationBuilder country(String country){
        this.country=country;
        return this;
    }

    public LocationBuilder region(String region){
        this.region=region;
        return this;
    }

   public Location createLocation(String city,String country,String region){
       return new Location(city,country,region);
   }

}
