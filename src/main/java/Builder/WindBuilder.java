package Builder;
import Domain.*;

public class WindBuilder {

    private int chill;
    private int direction;
    private float speed;

    public WindBuilder(){

    }

    public WindBuilder chill(int chill){
        this.chill=chill;
        return this;
    }

    public WindBuilder direction(int direction){
        this.direction=direction;
        return this;
    }

    public WindBuilder speed(float speed){
        this.speed=speed;
        return this;
    }

    public Wind createWind(int chill, int direction,float speed){

        return new Wind(chill,direction,speed);
    }

}
