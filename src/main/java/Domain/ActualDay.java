package Domain;

public class ActualDay {

    private String distance;
    private String pressure;
    private String speed;
    private String temperature;

    public ActualDay(String distance, String pressure, String speed, String temperature){
        this.distance=distance;
        this.pressure=pressure;
        this.speed=speed;
        this.temperature=temperature;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getDistance() {
        return distance;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getPressure() {
        return pressure;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getSpeed() {
        return speed;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Distance: " +distance + "Pressure: " +pressure + "Speed: " +speed + "Temperature: " +temperature;
    }
}
