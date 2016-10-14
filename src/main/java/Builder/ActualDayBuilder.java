package Builder;
import Domain.*;

public class ActualDayBuilder {

    private String distance;
    private String pressure;
    private String speed;
    private String temperature;

    ActualDayBuilder(){}

    public ActualDayBuilder distance(String distance){
        this.distance=distance;
        return this;
    }

    public ActualDayBuilder pressure(String pressure){
        this.pressure=pressure;
        return this;
    }

    public ActualDayBuilder speed(String speed){
        this.speed=speed;
        return this;
    }

    public ActualDayBuilder temperature(String temperature){
        this.temperature=temperature;
        return this;
    }

    public ActualDay createActualDay(String distance, String pressure, String speed, String temperature){

        return new ActualDay(distance,pressure,speed,temperature);
    }

}
