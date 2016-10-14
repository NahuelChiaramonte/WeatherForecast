package Domain;

public class Atmosphere {

    private int humidity;
    private double pressure;
    private int rising;
    private float visibility;

    public Atmosphere(int humidity, double pressure, int rising, float visibility){
        this.humidity=humidity;
        this.pressure=pressure;
        this.rising=rising;
        this.visibility=visibility;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getPressure() {
        return pressure;
    }

    public void setRising(int rising) {
        this.rising = rising;
    }

    public int getRising() {
        return rising;
    }

    public void setVisibility(float visibility) {
        this.visibility = visibility;
    }

    public float getVisibility() {
        return visibility;
    }

    @Override
    public String toString() {
        return "Humidity: " +humidity + "Pressure: " +pressure + "Rising: " +rising + "Visibility: " +visibility;
    }
}
