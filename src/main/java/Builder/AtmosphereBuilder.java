package Builder;
import Domain.*;

public class AtmosphereBuilder {

    private int humidity;
    private double pressure;
    private int rising;
    private float visibility;

    public AtmosphereBuilder(){

    }

    public AtmosphereBuilder humidity(int humudity){
        this.humidity=humidity;
        return this;
    }

    public AtmosphereBuilder pressure(double pressure){
        this.pressure=pressure;
        return this;
    }

    public AtmosphereBuilder rising(int rising){
        this.rising=rising;
        return this;
    }

    public AtmosphereBuilder visibility(float visibility){
        this.visibility=visibility;
        return this;
    }

    public Atmosphere createAtmosphere(int humidity, double pressure, int rising, float visibility){
        return new Atmosphere(humidity,pressure,rising,visibility);
    }


}
