package Domain;
import Builder.*;

public class Wind {

    private int chill;
    private int direction;
    private float speed;

    public Wind(int chill, int direction, float speed){
        this.chill=chill;
        this.direction=direction;
        this.speed=speed;
    }

    public void setChill(int chill) {
        this.chill = chill;
    }

    public int getChill() {
        return chill;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Chill" +chill + "Direction: " +direction + "Speed" +speed;
    }
}
